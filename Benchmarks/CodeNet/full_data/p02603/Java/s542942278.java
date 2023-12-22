import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;

//assert: x*(y*z)==(x*y)*z
class Semigroup<T>{
    BiFunction<T,T,T> fun;
    public Semigroup(BiFunction<T,T,T> fun){
        this.fun = fun;
    }
    public T fun(T x, T y){
        return fun.apply(x,y);
    }
}
 
// assert: id exists
class Monoid<T> extends Semigroup<T>{
    T id;
    public Monoid(BiFunction<T,T,T> fun, T id){
        super(fun);
        this.id = id;
    }
    public T identity(){
        return id;
    } 
 
    static Monoid<Long> mult(){
        return new Monoid<Long>((x,y)->x*y, 1L);
    }

    static Monoid<Long> minimum(){
        return new Monoid<Long>((x,y) -> Math.min(x,y), Long.MAX_VALUE);
    }
}
 
//assert: inverse exists
class Group<T> extends Monoid<T>{
    Function<T,T> inv;
    public Group(BiFunction<T,T,T> fun, T id, Function<T,T> inv){
        super(fun, id);
        this.inv = inv;
    }
    public T inverse(T x){
        return inv.apply(x);
    }
 
    static Group<Long> plus(){
        return new Group<Long>((x,y)->x+y, 0L, x -> -x);
    }
}
 
 
class SegmentTree<T>{
    int maxElmNum = 1048576;//this must be power of 2
    Object[] tree;
    Monoid<T> M;
    private static int parent(int i){
        return (i-1)/2;
    }
    private static int leftchild(int i){
        return 2*i+1;
    }
    private static int rightchild(int i){
        return 2*i+2;
    }
    //make the empty tree
    public SegmentTree(Monoid<T> M){
        this.M = M;
        tree = new Object[maxElmNum*4];
        for(int i=0;i<tree.length;i++) tree[i]=M.identity();
    }
    public SegmentTree(Monoid<T> M, T[] elements){
        this.M = M;
        tree = new Object[maxElmNum*4];
        for(int i=0;i<tree.length;i++) tree[i]=M.identity();
        this.make(elements);
    }
    //fix tree[i] and the ancestors
    private void refresh(int i){
        tree[i] = M.fun((T)(tree[leftchild(i)]), (T)(tree[rightchild(i)]));
        if(i>0) refresh(parent(i));
    }
    private void setTree(int i, T elm){
        tree[i] = elm;
        refresh(parent(i));
    }
    //replace array[i] with elm and refresh the tree
    public void set(int i, T elm){
        setTree(maxElmNum+i-1,elm);
    }
    //make new tree which contains the given array
    public void make(T[] elements){
        for(int i=0;i<elements.length;i++) tree[i+maxElmNum-1]=elements[i];
        for(int i=maxElmNum-2;i>=0;i--) tree[i]=M.fun((T)(tree[2*i+1]), (T)(tree[2*i+2]));
    }
    private T get(int left, int right, int nodeNum, int nodeStart, int nodeEnd){
        if(nodeEnd<=left || right<=nodeStart) return M.identity();
        if(left<=nodeStart && nodeEnd<=right) return (T)(tree[nodeNum]);
 
        T leftValue  = get(left,right,2*nodeNum+1,nodeStart,(nodeStart+nodeEnd)/2);
        T rightValue = get(left,right,2*nodeNum+2,(nodeStart+nodeEnd)/2,nodeEnd);
        return M.fun(leftValue,rightValue);
    }
    //calculate the answer in [l,r)
    public T get(int left, int right){
        return get(left,right,0,0,maxElmNum);
    }
}



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Long[] A = new Long[N+1];
        for(int n=0; n<N; n++) A[n] = sc.nextLong();
        A[N] = 0L;
        SegmentTree<Long> RMQ = new SegmentTree<>(Monoid.minimum(), A);

        int lastSell = 0;
        long money = 1000, stock = 0;
        for(int n=1; n<N; n++) if(A[n-1] <= A[n] && A[n] > A[n+1]){
            long lowest = RMQ.get(lastSell, n);
            stock += money/lowest;
            money %= lowest;
            //System.out.printf("day %d:%d stocks, %dyen -> %d yen\n", n,stock, lowest, A[n]);
            money += stock * A[n];
            stock = 0;

            lastSell = n;
        }

        System.out.println(money);

    }
}
