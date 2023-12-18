import java.io.*;
import java.util.*;

public class Main {

    private static class InputReader {
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
                } catch (IOException exp) {
                    throw new RuntimeException(exp);
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
    }

    public static void main(String[] args) {    //throws FileNotFoundException {
        InputStream inputStream = System.in;    //new FileInputStream("input.txt");
        OutputStream outputStream = System.out; //new FileOutputStream("output.txt");
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task newTask = new Task();
        newTask.solve(in, out);

        out.close();
    }

    private static class Task {
        //.constant
        private final int INF = Integer.MAX_VALUE;
        private final int MOD = (int)1e9 + 7;

        //.data
        private int[][] gr = new int[300][300];
        private int n = 0;

        private long f() {
            long sum = 0;
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    boolean flag = true;
                    for (int k = 0; k < n; ++k) {
                        if (i != j && j != k && i != k) {
                            if (gr[i][j] > gr[i][k] + gr[k][j]) {
                                return -1;
                            }
                            if (gr[i][j] == gr[i][k] + gr[k][j]) {
                                flag = false;
                            }
                        }
                    }
                    if (flag && i < j) {
                        sum += gr[i][j];
                    }
                }
            }
            return sum;
        }

        //.code
        public void solve(InputReader in, PrintWriter out) {
            n = in.nextInt();
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    gr[i][j] = in.nextInt();
                }
            }

            out.println(f());

        }//end

    }

}