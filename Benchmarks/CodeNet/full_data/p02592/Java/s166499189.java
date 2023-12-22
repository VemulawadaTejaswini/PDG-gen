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
    static void printP(int a, int b, int c){
        System.out.printf("+ %d %d %d\n",a,b,c);
    }
    static void printL(int a, int b, int c){
        System.out.printf("< %d %d %d\n",a,b,c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(1153);
        printP(1000,0,1001);
        printP(1000,1,1002);
        printP(1001,1002,1001);
        for(int i=2; i<102; i++){
            printP(1001, 1000+i-1, 1000+i);
        }//103

        for(int b=0; b<=10; b++){
            for(int i=0; i<=15; i++){
                printL(1000+b, 1, 500+b);
                printL(100+b, 0, 600+b);
                printP(500+b, 600+b, 700+b);
                printL(1001, 700+b, 700+b);
                printL(1000, 700+b, 200+b);
                printP(100+b, 1001, 100+b);
                printP(2, 200+b, 2);
            }
        }//1050


    }
}
