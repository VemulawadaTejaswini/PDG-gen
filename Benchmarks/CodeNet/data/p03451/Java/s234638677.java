import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = 1;
        Solver s = new Solver();
        for (int i = 1; i <= t; i++) {
            s.solve(i, in, out);
        }
        out.close();
    }

}

class Solver {

    void solve(int test, InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        for (int i = 0; i < n; i++) b[i] = in.nextInt();
        int[] pre1 = new int[n];
        int[] pre2 = new int[n];
        pre1[0] = a[0];
        pre2[0] = b[0];
        for (int i = 1; i < n; i++) {
            pre1[i] = a[i] + pre1[i - 1];
            pre2[i] = b[i] + pre2[i - 1];
        }
        long ans = -1;
        for (int i = 0; i < n; i++) {
            long left = pre1[i];
            long right = pre2[n - 1] - (i > 0 ? pre2[i - 1] : 0);
            ans = Math.max(left + right, ans);
        }
        out.println(ans);
    }
}

class InputReader {
    BufferedReader br;
    StringTokenizer st;

    public InputReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = null;
    }

    public String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}