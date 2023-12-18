

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		long gcd = gcd(a, b);
		Map<Long, Integer>  result = primeFactorize((long)gcd);
		System.out.println(result.size() + 1);
	}

	public static long gcd(long a, long b) {
        long t;
        if (b == 0) return a;
        while (a % b > 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return b;
    }

	public static Map<Long, Integer> primeFactorize(long p) {
        Map<Long, Integer> factor = new HashMap<>();
        if ((p & 1) == 0) {
            int c = 0;
            do {
                c++;
                p >>= 1;
            } while ((p & 1) == 0);
            factor.put(2L, c);
        }
        for (long i = 3; i * i <= p; i += 2) {
            if (p % i == 0) {
                int c = 0;
                do {
                    c++;
                    p /= i;
                } while ((p % i) == 0);
                factor.put(i, c);
            }
        }
        if (p > 1) {
            factor.put(p, 1);
        }
        return factor;
    }
}
