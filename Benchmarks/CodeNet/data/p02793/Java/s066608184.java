import java.util.*;
import java.io.*;
import java.math.BigInteger;

class FastReader {

    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException  e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

public class ABC152E {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int N = fr.nextInt();
        BigInteger[] A = new BigInteger[N];
        for (int i = 0; i < N; i++) A[i] = new BigInteger("" + fr.nextInt());
        BigInteger mod = new BigInteger("1000000007");
        BigInteger ans = BigInteger.ZERO;
        BigInteger prev = A[0];
        for (BigInteger a : A) {
            BigInteger l = lcm(prev, a);
            BigInteger factor = l.divide(prev).mod(mod);
            ans = (ans.multiply(factor).add(l.divide(a))).mod(mod);
            prev = l;
        }
        System.out.println(ans);
    }

    private static BigInteger lcm(BigInteger a, BigInteger b) {
        return a.multiply(b).divide(gcd(a, b));
    }
    private static BigInteger gcd(BigInteger a, BigInteger b) {
        if (b.equals(BigInteger.ZERO)) return a;
        return gcd(b, a.mod(b));
    }
}
