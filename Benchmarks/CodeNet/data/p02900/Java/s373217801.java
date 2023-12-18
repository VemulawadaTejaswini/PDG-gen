import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long max = Math.max(a,b);
        long min = Math.min(a,b);
        HashSet<Long> maxl = getPrimeFactorization(max);
        HashSet<Long> minl = getPrimeFactorization(min);
        int prime = 1;
        for(long p : maxl){
            if(minl.contains(p)){
                prime++;
            }
        }
        System.out.println(prime);
    }
    
    static HashSet<Long> getPrimeFactorization(long x) {
        HashSet<Long> result = new HashSet<Long>();
        while (x >= 2L && x % 2L == 0) {
            result.add(2L);
            x /= 2;
        }
        long d = 3;
        long q = x / d;
        while (q >= d) {
            if (x % d == 0) {
                result.add(d);
                x = q;
            } else {
                d += 2;
            }
            q = x / d;
        }
        if(x != 1){
            result.add(x);   
        }
        return result;
    }
}