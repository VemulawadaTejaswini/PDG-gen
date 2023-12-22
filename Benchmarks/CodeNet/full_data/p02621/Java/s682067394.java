
// Java program For handling Input/Output 
import java.io.*;
import java.util.*;
import java.math.*;
//import java.awt.*;

public class Main {
    BufferedReader br;
    StringTokenizer st;

    int max = -1;
    final long P = 998244353;
    final long P2 = 1000000007;

    HashSet<String> set = new HashSet<>();
    HashMap<Character, List<Integer>> map = new HashMap<>();

    // actual logic
    void solve() throws IOException {
        // int t = ni();
        // while (--t >= 0) {
        long a = nl();
        pl(a + a * a + a * a * a);
        // }

    }

    // constructor
    Main() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    Main(String s) {
        try {
            br = new BufferedReader(new FileReader(s));
            st = new StringTokenizer(br.readLine());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // main metohd
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    // Utility methods

    String ns() {
        if (!st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return st.nextToken();

    }

    int ni() {
        return Integer.parseInt(ns());
    }

    long nl() {
        return Long.parseLong(ns());
    }

    double nd() {
        return Double.parseDouble(ns());
    }

    void pl(String s) {
        System.out.println(s);
    }

    void pl(long s) {
        System.out.println(s);
    }

    void pl(double s) {
        System.out.println(s);
    }
}
