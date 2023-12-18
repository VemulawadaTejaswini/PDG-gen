import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        DMultipleOf2019 solver = new DMultipleOf2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMultipleOf2019 {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            String s = in.nextLine();
            long nu = 2019L;
            int n = s.length();
            int size = 4;
            int count = 0;
            while (size != n) {
                if (n - 1 - size < 0) {
                    size++;
                    continue;
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < size; i++) {
                    sb.append(s.charAt(i));
                }
                if (Long.parseLong(sb.toString()) % nu == 0)
                    count++;

                for (int i = size; i < n; i++) {
                    sb.deleteCharAt(0);
                    sb.append(s.charAt(i));
                    //out.println(sb.toString());
                    if (Long.parseLong(sb.toString()) % nu == 0) {
                        count++;
                        //out.println(sb.toString());
                    }
                }

                size++;

            }

            out.print(count);
        }

    }

    static class FastReader {
        BufferedReader br;

        public FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

