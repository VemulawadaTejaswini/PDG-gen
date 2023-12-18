import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;
 
    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);
 
    private void solve(Scanner sc) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < M; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            list.get(a).add(b);
            list.get(b).add(a);
        }
 
        List<Integer> route = new ArrayList<>();
        route.add(0);
        _out.println(search(0, N, list, route, new HashSet<>()));
    }
    private int search(int cur, int N, List<List<Integer>> list, List<Integer> route, Set<List<Integer>> set) {
        if (route.size() >= N) {
            if (route.size() == N && !set.contains(route)) {
                set.add(new ArrayList<>(route));
                return 1;
            }
            return 0;
        }
 
        int res = 0;
 
        for (int next : list.get(cur)) {
            if (!route.contains(next)) {
                route.add(next);
                res += search(next, N, list, route, set);
                route.remove(route.size() - 1);
            }
        }
 
        return res;
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