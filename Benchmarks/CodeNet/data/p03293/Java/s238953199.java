import java.io.*;
import java.util.*;

public class Main {


    private void solve(InputReader in, PrintWriter out) {
        String s = in.next();
        String t = in.next();
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        if (!Arrays.equals(arrS, arrT)) {
            out.println("No");
            return;
        }
        arrS = s.toCharArray();
        char[] res = new char[arrS.length];
        arrT = t.toCharArray();
        for (int i = 0; i < arrS.length; i++) {
            for (int j = 0; j < arrS.length; j++) {
                res[(j + 1) % arrS.length] = arrS[j];
                if (Arrays.equals(arrS, arrT)) {
                    out.println("Yes");
                    return;
                }
            }
            arrS = res.clone();

        }
        out.println("No");
    }


    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        try (
                InputReader in = new InputReader(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }


    static class InputReader implements AutoCloseable {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

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

        @Override
        public void close() {

        }
    }

}
