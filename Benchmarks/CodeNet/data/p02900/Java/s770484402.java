import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        List<Long> pl = getPrimeList((long)Math.max(a,b));
        int prime = 1;
        for(long p : pl){
            if(a % p == 0 && b % p == 0){
                prime++;
            }
        }
        System.out.println(prime);
    }
    
    private static ArrayList<Long> getPrimeList(long l){
        ArrayList<Long> ret = new ArrayList<Long>();
        if(l < 2) return ret;
        ret.add(2L);
        long len = (long)Math.pow(l,0.5)+1;
        for(long i = 3; i < len; i += 2){
            boolean bool = true;
            for(long p : ret){
                if(i % p == 0){
                    bool = false;
                    break;
                }
            }
            if(bool) ret.add(i);
        }
        return ret;
    }
}