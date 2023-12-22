import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            long n = Long.parseLong(br.readLine());
            printFactor(n);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void printFactor(long n) {
        System.out.print(n + ":");
        factorize(n, 3);
    }

    private static void factorize(long n, long r) {
        if (n == 1) {
            System.out.println();
            return;
        }
        System.out.print(" ");
        if (isPrime(n)) {
            System.out.print(n);
            System.out.println();
            return;
        } else if (n % 2 == 0) {
            System.out.print(2);
            n = n / (long) 2;
        } else {
            for (long i = r; i <= n; i += 2) {
                if (n % i == 0) {
                    r = i;
                    System.out.print(i);
                    n = n / i;
                    break;
                }
            }
        }

        factorize(n, r);
    }

    private static boolean isPrime(long n) {
        if (n == 2) {
            return true;
        }
        if (n < 2 || n % 2 == 0) {
            return false;
        }

        int i = 3;
        while (i <= Math.sqrt((double) n)) {
            if (n % i == 0) {
                return false;
            }
            i = i + 2;
        }
        return true;
    }
}