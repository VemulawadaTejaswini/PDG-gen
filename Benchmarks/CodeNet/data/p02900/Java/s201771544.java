import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        HashSet<Long> set = getPrimeSet(Math.max(a,b));
        long ans = 1;
        for(long l : set){
            if(a % l == 0 && b % l == 0) ans++;
        }
        System.out.println(ans);
    }
    
    public static HashSet<Long> getPrimeSet(long l){
        long powl = (long)Math.pow(l,0.5);
        HashSet<Long> ret = new HashSet<Long>();
        if(l % 2 == 0) ret.add((long)2);
        for(long i = 3; i <= powl; i+=2){
            if(l % i == 0){
                boolean boolL = true, boolU = true;
                long u = l/i;
                for(long r : ret){
                    if(i % r == 0){
                        boolL = false;
                    }
                    if(u % r == 0){
                        boolU = false;
                    }
                }
                if(boolL) ret.add(i);
                if(boolU) ret.add(u);
            }
        }
        return ret;
    }
}
