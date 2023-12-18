import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.SortedMap;
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
        ERoadwork solver = new ERoadwork();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERoadwork {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), q = in.nextInt();

            ERoadwork.Roadwork[] roadworks = new ERoadwork.Roadwork[n];
            for (int i = 0; i < n; i++) {
                int s = in.nextInt();
                int t = in.nextInt();
                int x = in.nextInt();
                roadworks[i] = new ERoadwork.Roadwork(s, t, x);
            }
            Arrays.sort(roadworks, Comparator.comparingInt(a -> a.x));

            int[] d = new int[q];
            TreeMap<Integer, Integer> people = new TreeMap<>();
            for (int i = 0; i < q; i++) {
                d[i] = in.nextInt();
                people.put(d[i], i);
            }
            int[] answer = new int[q];
            Arrays.fill(answer, -1);

            for (ERoadwork.Roadwork r : roadworks) {
                int left = r.s - r.x, right = r.t - r.x;

                List<Integer> peopleToRemove = new ArrayList<>();
                peopleToRemove.addAll(people.subMap(left, right).keySet());
                for (int p : peopleToRemove) {
                    int index = people.get(p);
                    answer[index] = r.x;
                    people.remove(p);
                }
            }

            for (int i = 0; i < q; i++) {
                out.println(answer[i]);
            }
        }

        static class Roadwork {
            final int s;
            final int t;
            final int x;

            Roadwork(int s, int t, int x) {
                this.s = s;
                this.t = t;
                this.x = x;
            }

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

