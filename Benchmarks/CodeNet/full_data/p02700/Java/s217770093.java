import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author EDGE
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BBattle solver = new BBattle();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBattle {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int a[] = in.nextIntArray(4);
            boolean flag = true;
            while (a[0] > 0 && a[2] > 0) {
                if (!flag)
                    a[0] = a[0] - a[3];
                else
                    a[2] = a[2] - a[1];
                //out.println(a[0]+" "+a[2]);
                flag = !flag;
            }
            if (a[0] <= 0)
                out.print("No");
            else
                out.print("Yes");
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
        }

    }
}

