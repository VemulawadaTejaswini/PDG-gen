import java.io.*;
import java.math.BigInteger;
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
        int x = 0, y = 0, t = 0;
        for (int i = 0; i < n; i++) {
            int t1 = in.nextInt();
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int diff = t1 - t;
            int dist = Math.abs(x1 - x) + Math.abs(y1 - y);
//            System.out.println(diff + " " + dist);
            if (diff >= dist) {
                if (dist % 2 == 0 && diff % 2 == 1) {
                    out.println("No");
                    return;
                }
                x = x1;
                y = y1;
                t = t1;
                continue;
            }
            out.println("No");
            return;
        }
        out.println("Yes");
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