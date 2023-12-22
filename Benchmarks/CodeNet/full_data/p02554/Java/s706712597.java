import java.io.PrintWriter;
import java.util.*;

public class Main {

    static Scanner sc;
    static PrintWriter out;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        new Main().solve();
        out.flush();
    }

    public void solve() {
        int n = sc.nextInt();
        long mod = 1000000007;
        long m10 = 1;
        long m9 = 1;
        long m8 = 1;

        for(int i=0; i<n; i++) {
            m10 *= 10;
            m9 *= 9;
            m8 *= 8;
            m10 %= mod;
            m9 %= mod;
            m8 %= mod;
        }

        long res = m10 - m9 * 2 + m8;
        res += mod * 10;
        res %= mod;
        out.println(res);

    }


}