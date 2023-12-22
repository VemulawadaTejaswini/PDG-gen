import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long sqrt = (long) Math.sqrt(N);

        if (isPrime(N)) {
            System.out.println("1");
            return;
        }

        Set<Long> prime = new HashSet<>();
        long tmp = N;
        for (long i = 2; i < sqrt; i++) {
            if (tmp < i) break;

            if (isPrime(i)) {
                while (tmp % i == 0) {
                    tmp /= i;
                    prime.add(i);
                }
            }
        }

        if (tmp > 1) {
            prime.add(tmp);
        }

        System.out.println(prime.size());
    }


    static boolean isPrime(long n) {
        if (n == 2) return true;
        if (n < 2) return false;
        if (n % 2 == 0) return false;

        long sqrt = (long) Math.sqrt(n);

        for (int i = 3; i < sqrt; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}


