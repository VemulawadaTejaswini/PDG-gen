import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer stok;

    String nextToken() throws IOException {
        while (stok == null || !stok.hasMoreTokens()) {
            String s = br.readLine();
            if (s == null) {
                return null;
            }
            stok = new StringTokenizer(s);
        }
        return stok.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    char nextChar() throws IOException {
        return (char) (br.read());
    }

    String nextLine() throws IOException {
        return br.readLine();
    }
    int pref;
    int get(String s, int curmin){
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += s.charAt(i) - '0';
            if (ans > curmin) {
                pref = i;
                return ans;
            }
        }
        pref = s.length();
        return ans;
    }
    BigInteger nn;

    BigInteger shouldAdd(String s, int pref)
    {
        BigInteger x = (pref > 0) ? new BigInteger(s.substring(0, pref)) : new BigInteger("0");
        x = x.add(BigInteger.ONE);
        StringBuilder sb = new StringBuilder(x.toString());
        for (int i = 0; i < s.length() - pref; i++) {
            sb.append("0");
        }
        x = (new BigInteger(sb.toString())).subtract(new BigInteger(s));
        x = x.add(nn.subtract(x.mod(nn)));
        return x;
    }

    void solve() throws IOException {
        int n = nextInt();
        BigInteger k = new BigInteger("0");
        nn = new BigInteger(Integer.toString(n));
        int min = Integer.MAX_VALUE;

        pref = 0;
        long cur = System.currentTimeMillis();
        BigInteger add = new BigInteger(Integer.toString(n));
//        while (min > 3) {
        while (System.currentTimeMillis() - cur < 1900) {
            k = k.add(add);
            min = Math.min(min, get(k.toString(), min));
            add = shouldAdd(k.toString(), pref);
        }
        out.println(min);
    }

    void run() throws IOException {
        // br = new BufferedReader(new FileReader("dragons.in"));
        //out = new PrintWriter("dragons.out");
        // br = new BufferedReader(new FileReader("input.txt"));
        // out = new PrintWriter("output.txt");
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        br.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        // Locale.setDefault(Locale.US);
        new Main().run();
    }
}