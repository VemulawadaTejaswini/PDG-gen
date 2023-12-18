import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        HashSet<Long> al = getPrimeFactorization(a);
        HashSet<Long> bl = getPrimeFactorization(b);
        int prime = 1;
        for(long p : bl){
            if(al.contains(p)){
                prime++;
            }
        }
        System.out.println(prime);
    }
    
    static HashSet<Long> getPrimeFactorization(long x) {
        HashSet<Long> result = new HashSet<Long>();
        while (x >= 2 && x % 2 == 0) {
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
        result.add(x);
        return result;
    }
}