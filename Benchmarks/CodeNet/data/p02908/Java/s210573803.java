import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] p = new int[n];
            int[] q = new int[n];
            for (int i = 0; i < n; ++i) p[i] = in.nextInt();
            for (int i = 0; i < n; ++i) q[i] = in.nextInt();

            TaskF.Cycle[] pc = new TaskF.Cycle[n];
            TaskF.Cycle[] qc = new TaskF.Cycle[n];
            TreeSet<TaskF.Cycle> cycles = new TreeSet<>(new Comparator<TaskF.Cycle>() {

                public int compare(TaskF.Cycle o1, TaskF.Cycle o2) {
                    int z = o2.score - o1.score;
                    if (z == 0) z = o1.where - o2.where;
                    if (z == 0) z = o1.at - o2.at;
                    return z;
                }
            });
            int score = 0;
            for (int i = 0; i < n; ++i) if (p[i] != q[i]) ++score;
            for (int i = 0; i < n; ++i)
                if (p[i] != i && pc[i] == null) {
                    TaskF.Cycle c = new TaskF.Cycle();
                    c.at = i;
                    c.where = 0;
                    int j = i;
                    do {
                        if (p[j] != q[j]) --c.score;
                        if (j != q[j]) ++c.score;
                        pc[j] = c;
                        j = p[j];

                    } while (j != i);
                    cycles.add(c);
                }
            for (int i = 0; i < n; ++i)
                if (q[i] != i && qc[i] == null) {
                    TaskF.Cycle c = new TaskF.Cycle();
                    c.at = i;
                    c.where = 1;
                    int j = i;
                    do {
                        if (p[j] != q[j]) --c.score;
                        if (j != p[j]) ++c.score;
                        qc[j] = c;
                        j = q[j];
                    } while (j != i);
                    cycles.add(c);
                }
            while (!cycles.isEmpty()) {
                TaskF.Cycle c = cycles.pollFirst();
                if (c.score <= 0) break;
                score += c.score;
                int i = c.at;
                int j = i;
                if (c.where == 0) {
                    do {
                        pc[j] = null;
                        TaskF.Cycle cc = qc[j];
                        if (cc != null) {
                            cycles.remove(cc);
                            if (p[j] != q[j]) ++cc.score;
                            cc.score -= 2;
                            cycles.add(cc);
                        }
                        j = p[j];
                    } while (j != i);
                } else {
                    do {
                        qc[j] = null;
                        TaskF.Cycle cc = pc[j];
                        if (cc != null) {
                            cycles.remove(cc);
                            if (p[j] != q[j]) ++cc.score;
                            cc.score -= 2;
                            cycles.add(cc);
                        }
                        j = p[j];
                    } while (j != i);
                }
            }
            out.println(score);
        }

        static class Cycle {
            int where;
            int at;
            int score;

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

