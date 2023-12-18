import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author deepanshu
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMegalomania solver = new DMegalomania();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMegalomania {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            DMegalomania.Job job[] = new DMegalomania.Job[n];
            for (int i = 0; i < n; i++)
                job[i] = new DMegalomania.Job(in.nextInt(), in.nextInt());
            Arrays.sort(job, new Comparator<DMegalomania.Job>() {

                        public int compare(DMegalomania.Job o1, DMegalomania.Job o2) {
                            return o1.dead > o2.dead ? 1 : -1;
                        }
                    }
            );
            long time = 0;
            int i = 0;
            while (i < n) {
                if (time + (long) job[i].consume > (long) job[i].dead) {
                    out.println("No");
                    return;
                } else {
                    time += job[i].consume;
                    i++;
                }
            }
            out.println("Yes");

        }

        static class Job {
            int consume;
            int dead;

            Job(int x, int y) {
                consume = x;
                dead = y;
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

