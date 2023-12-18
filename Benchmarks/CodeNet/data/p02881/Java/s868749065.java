
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (isPrime(n)) {
            System.out.println(n - 1);
            return;
        }

        long min = Integer.MAX_VALUE;
        for (long i = 1;i<=Math.sqrt(n);i++) {
            for (long j = i;j<n;j++) {
              if (i * j == n) {
                    min = Math.min(min, (i+j-2));
                }
            }
        }
        
        System.out.println(min);
    }

    private static boolean isPrime(long n) {
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i< Math.sqrt(n);i+=2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
