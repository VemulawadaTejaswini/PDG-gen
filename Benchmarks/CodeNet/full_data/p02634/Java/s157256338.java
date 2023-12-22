import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    long MOD = 998244353L;
    Map<Long, Long> cache = new HashMap<>();
    void solve(Scanner sc, PrintWriter pw) {
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        pw.println(func(A, B, C, D));
    }

    private long func(long a, long b, long c, long d) {
        if (c == a && b == d) {
            return 1L;
        }
        Long key = c * 1000 + d;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        long ans = 0;
        if (c > a) {
            long part = func(a, b, c - 1, d);
            ans = (part * d) % MOD;
        }
        if (d > b) {
            long part = func(a, b, c , d - 1);
            ans = (ans + (part * c))% MOD;
        }
        if (c > a && d > b) {
            ans = (ans - (func(a, b, c - 1, d - 1) * (c - 1) * (d - 1))% MOD) % MOD;
        }
        ans = (ans + MOD) % MOD;
        cache.put(key, ans);
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        new Main().solve(sc, pw);
        pw.flush();
        pw.close();
        sc.close();
    }
}
