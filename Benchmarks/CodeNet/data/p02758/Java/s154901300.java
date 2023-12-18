import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    static final long MOD = 998244353;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        Robot[] robots = new Robot[n];
        for (int j = 0; j < n; j++) {
            String line = in.readLine();
            int six = line.indexOf(' ');
            robots[j] = new Robot(Integer.parseInt(line.substring(0, six)), Integer.parseInt(line.substring(six + 1)));
        }
        Arrays.sort(robots, Comparator.comparingInt(robot -> robot.x));
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        SegmentTree segTree = new SegmentTree(0, n - 1);
        treeMap.put(Integer.MAX_VALUE, n);
        long[] sums = new long[n + 1];
        sums[n] = 1;
        for (int j = n - 1; j >= 0; j--) {
            sums[j] = sums[j + 1];
            int k = treeMap.ceilingEntry(robots[j].x + robots[j].d).getValue();
            segTree.update(j, k);
            //System.out.println("j = " + j + ", k = " + k);
            k = segTree.query(j, k - 1);
            //System.out.println("j = " + j + ", k = " + k);
            segTree.update(j, k);
            sums[j] += sums[k];
            sums[j] %= MOD;
            treeMap.put(robots[j].x, j);
        }
        System.out.println(sums[0]);
    }

    static class Robot {
        final int x;
        final int d;

        Robot(int x, int d) {
            this.x = x;
            this.d = d;
        }
    }

    static class SegmentTree {
        final int[] val;
        final int treeFrom;
        final int length;

        SegmentTree(int treeFrom, int treeTo) {
            this.treeFrom = treeFrom;
            int length = treeTo - treeFrom + 1;
            int l;
            for (l = 0; (1 << l) < length; l++);
            val = new int[1 << (l + 1)];
            this.length = 1 << l;
        }

        void update(int index, int delta) {
            int node = index - treeFrom + length;
            val[node] = delta;
            for (node >>= 1; node > 0; node >>= 1) {
                val[node] = Math.max(val[node << 1], val[(node << 1) + 1]);
            }
        }

        int query(int from, int to) {
            if (to < from) {
                return 0;
            }
            from += length - treeFrom;
            to += length - treeFrom + 1;
            int res = 0;
            for (; from + (from & -from) <= to; from += from & -from) {
                res = Math.max(res, val[from / (from & -from)]);
            }
            for (; to - (to & -to) >= from; to -= to & -to) {
                res = Math.max(res, val[(to - (to & -to)) / (to & -to)]);
            }
            return res;
        }
    }
}

