import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class Counter<T> extends TreeMap<T,Long>{
    public Counter(){
        super();
    }
    public Counter(List<T> list){
        super();
        for(T e: list) this.addOne(e);
    }
    public Long count(Object elm){
        return getOrDefault(elm,0L);
    }
    public void add(T elm, long amount){
        if(!this.containsKey(elm)) put(elm, amount);
        else replace(elm, get(elm)+amount);
        if(this.count(elm)==0) this.remove(elm);
    }
    public void addOne(T elm){
        this.add(elm, 1);
    }
    public void removeOne(T elm){
        this.add(elm, -1);
    }
    public void removeAll(T elm){
        this.add(elm, -this.count(elm));
    }
    public static<T> Counter<T> merge(Counter<T> a, Counter<T> b){
        Counter<T> c = new Counter<>();
        for(T x: a.keySet()) c.add(x, a.count(x));
        for(T y: b.keySet()) c.add(y, b.count(y));
        return c;
    }
}
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
    static int findFirstIndexMore(Long[] A, long m){
        int N = A.length;
        if(A[0] >= m) return 0;
        if(A[N-1] < m) return N;
        int less = 0, more = N-1;
        while(less+1 < more){
            int mid = (less+more)/2;
            if(A[mid] >= m) more = mid;
            else less = mid;
        }
        return more;
    }
    
    static long divCeil(long a, long b){
        return (a+b-1)/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        final long P = 200003L;
        int N = sc.nextInt();
        Long[] A = new Long[N];
        for(int n=0; n<N; n++) A[n] = sc.nextLong();
        Arrays.sort(A);

        SegmentTree<Long> tree = new SegmentTree<>(Group.plus(), A);

        
        long ans = 0;

        for(int n=0; n<N; n++){
            //System.out.printf("A[%d]=%d -> d=[%d,%d]\n", n,A[n], A[n]*A[n]/P,A[n]);
            for(long d=A[n]*A[n]/P; d<=A[n]; d++){
                if(A[n]==0) continue;
                
                int left = findFirstIndexMore(A, divCeil(d*P, A[n]));
                int right = findFirstIndexMore(A, divCeil((d+1)*P, A[n]));

                left = Math.max(left, n+1);
                if(left<right && right>n){
                    ans += tree.get(left, right) * A[n] - d*P*(right-left);
                    //System.out.printf("d=%d : A[m]=[%d,%d) : m=[%d,%d)\n", d, divCeil(d*P, A[n]),divCeil((d+1)*P, A[n]), left,right);
                }                
            }
        }

        System.out.println(ans);


    }
}
