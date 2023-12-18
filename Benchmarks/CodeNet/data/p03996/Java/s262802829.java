import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 * 
 * @author daltao
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "daltao", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            TaskE solver = new TaskE();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskE {
        public void solve(int testNumber, FastInput in, PrintWriter out) {
            int m = in.readInt();
            int n = in.readInt();
            int q = in.readInt();
            int[] seq = new int[q + 1];
            int[] last = new int[q + 1];
            int[] reg = new int[n + 1];
            for (int i = 1; i <= q; i++) {
                seq[i] = in.readInt();
                last[i] = reg[seq[i]];
                reg[seq[i]] = i;
            }

            List<Integer> perms = new ArrayList<>();
            List<Integer> cnts = new ArrayList<>();
            Constraint[] constraints = new Constraint[q + 1];
            List<Constraint> wait = new ArrayList<>(q);
            boolean[] used = new boolean[n + 1];
            boolean flag = true;
            int nextValue = 1;

            for (int i = q; i >= 1; i--) {
                int v = seq[i];
                if (used[v]) {
                    continue;
                }
                used[v] = true;
                flag = flag && nextValue == v;
                nextValue++;
            }

            Arrays.fill(used, false);
            if (flag) {
                out.println("Yes");
                return;
            }

            for (int i = q; i >= 1; i--) {
                int v = seq[i];
                if (used[v]) {
                    continue;
                }
                for (int j = 0, until = wait.size(); j < until; j++) {
                    Constraint c = wait.get(j);
                    c.num = v;
                    c.require = m - j;
                    constraints[c.index] = c;
                }

                used[v] = true;
                wait.clear();
                for (int j = i; j >= 1; j = last[j]) {
                    Constraint c = new Constraint();
                    c.index = j;
                    wait.add(c);
                }
                perms.add(v);
                cnts.add(wait.size());
            }

            if (cnts.get(0) < m) {
                out.println("No");
                return;
            }

            int[] cnt = new int[n + 1];
            if (perms.get(perms.size() - 1) == 1) {
                cnt[1] = m;
            }
            for (int i = 1; i <= q; i++) {
                cnt[seq[i]]++;
                if (constraints[i] != null) {
                    if (cnt[constraints[i].num] < constraints[i].require) {
                        out.println("No");
                        return;
                    }
                }
            }

            out.println("Yes");
            return;
        }

    }
    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }
    static class Constraint {
        int index;
        int num;
        int require;

    }
}

