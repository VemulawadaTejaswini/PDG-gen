import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
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
            TaskC solver = new TaskC();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskC {
        public void solve(int testNumber, FastInput in, PrintWriter out) {
            int n = in.readInt();
            int[] a = new int[n];
            int max = 0;

            Map<Integer, Integer> cntMap = new HashMap<>(n);
            for (int i = 0; i < n; i++) {
                a[i] = in.readInt();
                max = Math.max(max, a[i]);
                cntMap.put(a[i], cntMap.getOrDefault(a[i], 0) + 1);
            }

            int atLeast = (max + 1) / 2 + 1;
            boolean flag = true;
            for (int i = (max + 1) / 2; i <= max; i++) {
                flag = flag && remove(cntMap, i);
                if (i == (max + 1) / 2 && max % 2 == 1) {
                    flag = flag && remove(cntMap, i);
                }
            }

            for (Integer k : cntMap.keySet()) {
                flag = flag && k >= atLeast;
            }

            out.print(flag ? "Possible" : "Impossible");
        }

        public boolean remove(Map<Integer, Integer> map, int k) {
            int val = map.getOrDefault(k, 0);
            if (val == 0) {
                return false;
            }
            map.remove(k);
            val--;
            if (val > 0) {
                map.put(k, val);
            }
            return true;
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
}

