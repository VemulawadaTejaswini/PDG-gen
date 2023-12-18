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
    }
}
public class Main {
    static void answer(int ans){
        System.out.println(ans);
        System.exit(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        Counter<Integer> counter = new Counter<>();
        for(int n=0; n<N; n++){
            counter.add(sc.nextInt(), sc.nextLong());
        }
        while(K>0){
            int least = counter.firstKey();
            K -= counter.get(least);
            if(K<=0) answer(least);
            counter.remove(least);
        }
    }
}
