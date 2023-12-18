import java.util.*;
import java.lang.*;

class Counter<T> extends TreeMap<T,Long>{
    public Counter(){
        super();
    }
    public Long count(Object elm){
        return getOrDefault(elm,0L);
    }
    public void add(T elm, long amount){
        if(!this.containsKey(elm)) put(elm, amount);
        else replace(elm, get(elm)+amount);
        if(this.count(elm)==0) this.remove(elm);
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] V = new long[N];
        for(int n=0; n<N; n++) V[n]=sc.nextInt();
        long ans = 0;
        for(int A=0; A<=Math.min(N,K); A++) for(int B=0; A+B<=Math.min(N,K); B++){
            Counter<Long> popedJewels = new Counter<>();
            for(int a=0; a<A; a++) popedJewels.add(V[a],1);
            for(int b=0; b<B; b++) popedJewels.add(V[N-B+b], 1);
            for(int p=0; p<K-A-B; p++){
                if(!popedJewels.isEmpty() && popedJewels.count(popedJewels.firstKey())<0) popedJewels.add(popedJewels.firstKey(),-1);
            }
            long total=0;
            System.err.println(popedJewels);
            for(long j:popedJewels.keySet()) total += j*popedJewels.get(j);
            ans = Math.max(ans,total);
        }
        System.out.println(ans);

    }
}
