import java.io.*;
import java.math.BigDecimal;
import java.text.Bidi;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task task = new Task();
        task.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();

            if (a * a + b * b + c * c - 2 * a * b - 2 * b * c - 2 * a * c > 0) {
                out.println("Yes");
            } else {
                out.println("No");
            }

//            double left = a + b + 2 * Math.sqrt(a * b);
//            double right = c;
//            long x = Math.abs(c - a - b);
//            BigDecimal bigDecimal = new BigDecimal(String.valueOf(x));
//            BigDecimal aBig = new BigDecimal(String.valueOf(a));
//            BigDecimal bBig = new BigDecimal(String.valueOf(b));
//            BigDecimal right = bigDecimal.multiply(bigDecimal);
//            BigDecimal four = new BigDecimal(Integer.toString(4));
////            out.println(-100000000000L >> 1);
//            out.println(aBig.multiply(bBig).multiply(four).compareTo(right) < 0 ? "Yes" : "No");

//            out.println(Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c) ? "Yes" : "No");
        }
    }

    static class InputReader {

        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}
