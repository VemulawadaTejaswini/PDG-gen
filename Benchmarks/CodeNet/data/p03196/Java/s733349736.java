import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */
class Counter<T> extends HashMap<T,Integer>{
    public Counter(){
        super();
    }
    public Integer get(Object elm){
        return getOrDefault(elm,0);
    }
    public void add(T elm, int amount){
        if(!this.containsKey(elm)) put(elm, amount);
        else replace(elm, get(elm)+amount);
    }
    public void addOne(T elm){
        add(elm, 1);
    }
    public void remove(T elm, int amount){
        replace(elm, Math.max(get(elm)-amount, 0));
    }
    public void removeOne(T elm){
        remove(elm, 1);
    }
}

public class Main {

    public static Counter<Long> fact(long N){
        Counter<Long> divisors = new Counter<>();
        long d = 2;
        while(d*d <= N){
            if(N%d==0) {
                divisors.addOne(d);
                N /= d;
            }
            else d++;
        }
        if(N>1) divisors.addOne(N);
        return divisors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long P = sc.nextLong();

        Counter<Long> divisors = fact(P);

        long ans = 1;
        for(long d: divisors.keySet()){
            int a = divisors.get(d);
            for(long i=0; i<a/N; i++) ans *= d;
        }
        System.out.println(ans);
    }
}
