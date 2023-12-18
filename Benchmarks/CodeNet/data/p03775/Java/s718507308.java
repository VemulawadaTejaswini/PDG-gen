import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private void solve(Scanner sc) {
        long N = sc.nextLong();

        long A = 1;
        long B = N;
        while (A < B && B % 2 == 0) {
            A *= 2;
            B /= 2;
        }
        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            while (A < B && B % i == 0) {
                A *= i;
                B /= i;
            }
        }
        _out.println(F(A, B));
    }
    private Map<Integer, Integer> primeFactorization(long n) {
        return null;
    }
    private int F(long a, long b) {
        return Math.max(String.valueOf(a).length(), String.valueOf(b).length());
    }
    private static List<Integer> primeList;
    private static void makePrimeList(int n) {
        List<Integer> searchList = new ArrayList<>();
        for (int i = 2; i <= n; ++i) {
            searchList.add(i);
        }
        primeList = new ArrayList<>(n);

        do {
            int prime = searchList.remove(0);
            primeList.add(prime);
            int i = 2;
            while (prime * i <= n) {
                searchList.remove((Integer)(prime * i));
                ++i;
            }
        } while (searchList.size() > 0 && searchList.get(0) <= Math.sqrt(n));
        primeList.addAll(searchList);
    }
    private static BigInteger C(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        for (long i = r; i > 1; --i) {
            res = res.divide(BigInteger.valueOf(i));
        }
        return res;
    }
    private static BigInteger P(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) {
        long S = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        new Main().solve(sc);
        _out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            _err.println((G - S) + "ms");
        }
        _err.flush();
    }
}