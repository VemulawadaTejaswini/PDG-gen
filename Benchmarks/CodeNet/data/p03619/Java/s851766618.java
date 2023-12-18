import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractMap;
import java.util.stream.Stream;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
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
            FountainWalk solver = new FountainWalk();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class FountainWalk {
        double circle = Math.PI * 10 / 2;

        public void solve(int testNumber, FastInput in, PrintWriter out) {
            Point begin = new Point();
            begin.x = in.readInt();
            begin.y = in.readInt();

            Point end = new Point();
            end.x = in.readInt();
            end.y = in.readInt();

            int n = in.readInt();
            List<Point> pts = new ArrayList<>(n);

            for (int i = 0; i < n; i++) {
                Point pt = new Point();
                pt.x = in.readInt();
                pt.y = in.readInt();
                pts.add(pt);
            }

            if (begin.x > end.x) {
                begin.x = -begin.x;
                end.x = -end.x;
                for (Point pt : pts) {
                    pt.x = -pt.x;
                }
            }
            if (begin.y > end.y) {
                begin.y = -begin.y;
                end.y = -end.y;
                for (Point pt : pts) {
                    pt.y = -pt.y;
                }
            }

            Point[] ptArray = pts.stream().filter(x -> inRange(begin, end, x.x, x.y)).toArray(x -> new Point[x]);
            Arrays.sort(ptArray, (a, b) -> Integer.compare(a.x, b.x));

            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < ptArray.length; i++) {
                Point pt = ptArray[i];
                Map.Entry<Integer, Integer> floor = map.floorEntry(pt.y);
                int dp = (floor == null ? 0 : floor.getValue()) + 1;
                while (true) {
                    Map.Entry<Integer, Integer> ceil = map.ceilingEntry(pt.y);
                    if (ceil == null || ceil.getValue() >= dp) {
                        break;
                    }
                    map.remove(ceil.getKey());
                }
                map.put(pt.y, dp);
            }

            int cnt = map.isEmpty() ? 0 : map.lastEntry().getValue();
            double ans = (double) (end.x - begin.x + end.y - begin.y) * 100;
            ans = ans + cnt * (circle - 20);

            if (cnt == (end.x - begin.x + 1) || cnt == (end.y - begin.y + 1)) {
                ans += circle;
            }

            out.printf("%.15f", ans);
        }

        public boolean inRange(Point lb, Point rt, int x, int y) {
            return lb.x <= x && rt.x >= x && lb.y <= y && rt.y >= y;
        }

    }
    static class Point {
        int x;
        int y;

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
                    bufLen = -1;
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

