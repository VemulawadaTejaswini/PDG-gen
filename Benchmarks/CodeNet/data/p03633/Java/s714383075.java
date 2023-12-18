import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long t[] = new long[n];
        for (int i = 0; i < n; i++) {
            t[i] = in.nextLong();
        }

        long ans = 1;
        List<Long> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (ans % t[i] == 0) {
                continue;
            }

            for (Long l : list) {
                if (t[i] % l == 0) {
                    t[i] /= l;
                }
            }
            list.addAll(factorization(t[i]));
            ans *= t[i];
        }

        System.out.println(ans);
    }

    static long gcd(long a, long b) {
        if (b % a == 0) {
            return a;
        }
        return gcd(b % a, a);
    }

    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    static boolean isPrime(long n) {
        if (n == 1) return false;
        if (n == 2) return true;
        for (long i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static List<Long> factorization(long n) {
        List<Long> fact = new LinkedList<>();

        if (n == 1 || n == 0) {
            fact.add(n);
            return fact;
        }

        Long m = n;
        Long i = 2L;
        while (n > 1) {
            if (n % i == 0) {
                fact.add(i);
                n /= i;
            } else {
                i++;
                if (i > Math.sqrt(m) && n == m) {
                    fact.add(n);
                    break;
                }
            }
        }
        return fact;
    }
}