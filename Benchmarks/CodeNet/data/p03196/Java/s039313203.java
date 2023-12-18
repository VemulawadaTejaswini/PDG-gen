import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long P = sc.nextLong();

        long aa = primeFactorization(P, N);

//        long ans = map.entrySet()
//                .stream()
//                .filter(e -> e.getValue() >= N)
//                .mapToLong(e -> e.getKey())
//                .reduce(1, (a, b) -> a * b);

        System.out.println(aa);
    }

    private static long primeFactorization(long n, long num) {
        long aa = 1;

        long m = n;
        int count = 0;
        while (m % 2 == 0) {
            count++;
            m = m / 2;
        }
        if (count >= num) {

            aa *= (long) Math.pow(2, count / num);
        }

        for (int i = 1; 2 * i + 1 <= m; i++) {
            count = 0;
            long a = 2 * i + 1;

            if (m % a != 0) {
                continue;
            }

            while (m % a == 0) {
                count++;
                m /= a;
            }

            if (count >= num) {
                aa *= a;
            }

            if (m == 1) {
                break;
            }
        }

        return aa;
    }
}