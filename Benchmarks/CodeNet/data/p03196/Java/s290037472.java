import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long P = sc.nextLong();

        long ans = gcd(P, N);
        if(N==1){
            ans = P;
        }
        System.out.println(ans);
    }

    private static long gcd(long p, long n) {
        long gcd = 1;

        long m = p;
        int count = 0;

        for (long i = 2; (i * i) <= p; i++) {
            count = 0;
            while (m % i == 0) {
                count++;
                m /= i;
            }
            if (count >= n) {
                gcd *= (long) Math.pow(i, count / n);
            }
        }
        return gcd;
    }
}