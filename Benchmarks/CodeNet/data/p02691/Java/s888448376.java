import java.util.*;
import java.lang.*;
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
        this.add(elm, this.count(elm));
    }
    public static<T> Counter<T> merge(Counter<T> a, Counter<T> b){
        Counter<T> c = new Counter<>();
        for(T x: a.keySet()) c.add(x, a.count(x));
        for(T y: b.keySet()) c.add(y, b.count(y));
        return c;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] A = new long[N];
        for(int n=0; n<N; n++) A[n] = sc.nextLong();

        long ans = 0;

        Counter<Long> counter = new Counter<>();
        for(int m = 0; m < N; m++){
            ans += counter.count(m - A[m]);
            counter.addOne(m + A[m]);
        }
        
        System.out.println(ans);
    }
}
