
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream;
        if (args.length > 0 && args[0].equals("devTesting")) {
            try {
                inputStream = new FileInputStream(args[1]);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            inputStream = System.in;
        }
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(0, in, out);
        out.close();
    }

    static class TaskC {
        
        void solve(int testNumber, InputReader in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            
            int ans1 = a * x + b * y;
            int ans3 = 2 * c * Math.max(x, y);
            int ans2 = 0;
            int dt = Math.min(x, y);
            ans2 += 2 * c * dt;
            x -= dt;
            y -= dt;
            ans2 += a * x;
            ans2 += b * y;
            ans1 = Math.min(ans1, ans2);
            ans1 = Math.min(ans1, ans3);
            out.println(ans1);
        }
        
        int i(long x) {
            return (int) x;
        }

        <T> void heapsort(T[] a, int s, int e) {
            Queue<T> queue = new PriorityQueue<>();
            for (int i = s; i <= e; ++i) {
                queue.add(a[i]);
            }
            for (int i = s; i <= e; ++i) {
                a[i] = queue.poll();
            }
        }

    }

    static class InputReader {

        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
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

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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

        public boolean hasInput() {
            try {
                if (tokenizer != null && tokenizer.hasMoreTokens()) {
                    return true;
                }
                reader.mark(1);
                int ch = reader.read();
                if (ch != -1) {
                    reader.reset();
                    return true;
                }
                return false;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
