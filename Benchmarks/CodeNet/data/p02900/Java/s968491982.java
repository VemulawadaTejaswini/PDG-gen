import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        HashSet<Long> aset = getPrimeSet(a);
        HashSet<Long> bset = getPrimeSet(b);
        long ans = 1;
        for(long l : aset){
            if(bset.contains(l)) ans++;
        }
        System.out.println(ans);
    }
    
    public static HashSet<Long> getPrimeSet(long l){
        HashSet<Long> ret = new HashSet<Long>();
        boolean div2 = false;
        while(l % 2 == 0){
            div2 = true;
            l /= 2;
        }
        if(div2) ret.add((long)2);
        long i = 3;
        while(l >= i){
            boolean divi = false;
            while(l % i == 0){
                divi = true;
                l /= i;
            }
            if(divi) ret.add(i);
            i += 2;
        }
        return ret;
    }
}
