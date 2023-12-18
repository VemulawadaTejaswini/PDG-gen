import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        HashSet<Long> hs = calc_n1(n-1);
        hs = calc_n0(n,hs);
        System.out.println(hs.size());
    }
    
    public static HashSet<Long> calc_n1(long l){
        long max = (long)Math.pow(l,0.5)+1;
        HashSet<Long> ret = new HashSet<>();
        ret.add(l-1);
        for(long i = 2; i < max; i++){
            if(l % i == 0){
                ret.add(l/i);
                ret.add(i);
            }
        }
        return ret;
    }
    
    public static HashSet<Long> calc_n0(long l, HashSet<Long> hs){
        long max = (long)Math.pow(l,0.5)+1;
        hs.add(l);
        for(long i = 2; i < max; i++){
            long l2 = l;
            boolean div = false;
            while(l2 % i == 0){
                l2 /= i;
                div = true;
            }
            if(l2 % i == 1 && div){
                hs.add(i);
            }
        }
        return hs;
    }
}