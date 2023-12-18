import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Pattern;

public class Main {
    public void solve(Stdin stdin, PrintWriter stdout) throws NumberFormatException, IOException {
        int n = stdin.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = stdin.nextLong();
        }

        long[] c = new long[61];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 61; j++) {
                if ((a[i] & (1L << j)) != 0) {
                    c[j]++;
                }
            }
        }

        long ans = 0;
        long d = 1;
        for (int i = 0; i < 61; i++) {
            ans += d * c[i] * (n - c[i]);
            ans %= 1000000000 + 7;
            d *= 2;
        }
        stdout.println(ans);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Stdin stdin = new Stdin();
        PrintWriter stdout = new PrintWriter(System.out, false);
        new Main().solve(stdin, stdout);
        stdout.flush();
    }

    public static class Stdin {
        private Deque<String> queue;
        private BufferedReader stdin;
        private Pattern delimiter;

        public Stdin() {
            queue = new ArrayDeque<>();
            stdin = new BufferedReader(new InputStreamReader(System.in));
            delimiter = Pattern.compile(" ");
        }

        public String next() throws IOException {
            if (queue.isEmpty()) {
                delimiter.splitAsStream(stdin.readLine()).forEach(queue::addLast);
            }
            return queue.removeFirst();
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }
    }
}
