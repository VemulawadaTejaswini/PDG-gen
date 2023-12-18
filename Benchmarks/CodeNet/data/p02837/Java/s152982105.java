import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CHonestOrUnkind2 solver = new CHonestOrUnkind2();
        solver.solve(1, in, out);
        out.close();
    }

    static class CHonestOrUnkind2 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            CHonestOrUnkind2.Person[] persons = new CHonestOrUnkind2.Person[n];
            for (int i = 0; i < n; ++i) {
                int a = in.nextInt();
                persons[i] = new CHonestOrUnkind2.Person();
                for (int j = 0; j < a; ++j) {
                    persons[i].testimonies.add(new CHonestOrUnkind2.Testimony(in.nextInt() - 1, in.nextInt()));
                }
            }
            int best = 0;
            for (int i = 0; i < (1 << n); ++i) {
                boolean contradiction = false;
                outer:
                for (int j = 0; j < n; ++j) {
                    if ((i & (1 << j)) > 0) {
                        List<CHonestOrUnkind2.Testimony> test = persons[j].testimonies;
                        for (CHonestOrUnkind2.Testimony testimony : test) {
                            if ((i & (1 << testimony.x)) > 0) {
                                if (testimony.y == 0) {
                                    contradiction = true;
                                    break outer;
                                }
                            } else {
                                if (testimony.y == 1) {
                                    contradiction = true;
                                    break outer;
                                }
                            }
                        }
                    }
                }
                if (!contradiction) {
                    best = Math.max(best, Integer.bitCount(i));
                }
            }
            out.println(best);
        }

        static class Testimony {
            int x;
            int y;

            public Testimony(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public String toString() {
                return "Testimony{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
            }

        }

        static class Person {
            List<CHonestOrUnkind2.Testimony> testimonies = new ArrayList<>();

        }

    }

    static class InputReader {
        private StringTokenizer st;
        private BufferedReader reader;

        public InputReader(InputStream is) {
            st = null;
            reader = new BufferedReader(new InputStreamReader(new BufferedInputStream(is, 1 << 18)));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

