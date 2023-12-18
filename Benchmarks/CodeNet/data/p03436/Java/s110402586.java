import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.BitSet;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DGridRepainting solver = new DGridRepainting();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGridRepainting {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt();
            int n = h * w;

            BitSet grid = new BitSet(h * w);
            for (int i = 0; i < h; i++) {
                char[] row = in.next().toCharArray();
                for (int j = 0; j < w; j++) {
                    grid.set(i * w + j, row[j] == '#');
                }
            }

            int[] moves = {1,
                           -1,
                           -w,
                           w};

            Queue<Integer> q = new ArrayDeque<>();
            q.add(0);
            BitSet visited = new BitSet();
            visited.set(0);

            int[] distance = new int[n];
            distance[0] = 1;

            while (!q.isEmpty()) {
                int cur = q.poll();
                for (int m : moves) {
                    int next = cur + m;
                    if (next < 0 || next >= n)
                        continue;

                    if (visited.get(next) || grid.get(next))
                        continue;

                    if (!(next % w == cur % w ^ next / w == cur / w))
                        continue;

                    q.add(next);
                    visited.set(next);
                    distance[next] = distance[cur] + 1;
                }
            }

            System.out.println(Arrays.toString(distance));

            int answer = -distance[n - 1];
            for (int i = 0; i < n; i++) {
                if (!grid.get(i))
                    answer++;
            }

            if (!visited.get(n - 1))
                answer = -1;

            out.println(answer);
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

    }
}

