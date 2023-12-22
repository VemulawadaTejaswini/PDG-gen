import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Vector;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Hamadneh
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CMarks solver = new CMarks();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMarks {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt(), K = in.nextInt();
            int v[] = new int[N];
            java.util.Vector<java.math.BigInteger> res = new java.util.Vector<java.math.BigInteger>();
            int c = 0;
            java.math.BigInteger mul = new java.math.BigInteger("1");
            int j = 0;
            for (int i = 0; i < N; i++) {
                v[i] = in.nextInt();
                mul = mul.multiply(new java.math.BigInteger(v[i] + ""));
                c++;
                if (c == K) {
                    c--;
                    res.add(mul);
                    mul = mul.divide(new java.math.BigInteger(v[j++] + ""));
                }
            }
            int temp = N - K;
            for (int t = res.size() - temp; t < res.size(); t++) {
                if (res.get(t).compareTo(res.get(t - 1)) > 0)
                    out.print("Yes\n");
                else
                    out.print("No\n");
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 23969535);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

