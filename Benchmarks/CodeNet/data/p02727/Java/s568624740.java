import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        long[] p = new long[A];
        long[] q = new long[B];
        long[] r = new long[C];
        for (int i = 0; i < A; i++) {
            p[i] = scan.nextLong();
        }
        for (int i = 0; i < B; i++) {
            q[i] = scan.nextLong();
        }
        for (int i = 0; i < C; i++) {
            r[i] = scan.nextLong();
        }
        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);
        long ans = 0;
        ans = Math.max(ans, solve(p, q, r, X, Y));
        ans = Math.max(ans, solve(q, r, r, Y, X));
        System.out.println(ans);
    }
    private long solve(long[] p, long[] q, long[] r, int X, int Y) {
        long ans = 0;
        PriorityQueue<Holder> queue = new PriorityQueue<>(new HolderComparator());
        for (int i = 0; i < p.length; i++) {
            queue.add(new Holder(p[i],0));
        }
        for (int i = 0; i < r.length; i++) {
            queue.add(new Holder(r[i], 2));
        }
        int count = 0;
        for (int i = 0; i < X; i++) {
            Holder holder = queue.poll();
            ans += holder.value;
            if (holder.type == 2) {
                count += 1;
            }
        }
        queue.clear();
        for (int i = 0; i < q.length; i++) {
            queue.add(new Holder(q[i],1));
        }
        for (int i = 0; i < r.length - count; i++) {
            queue.add(new Holder(r[i], 2));
        }
        for (int i = 0; i < Y; i++) {
            Holder holder = queue.poll();
            ans += holder.value;
        }
        return ans;
    }

    class Holder {
        long value;
        int type;
        Holder(long value, int type) {
            this.value = value;
            this.type = type;
        }
    }
    class HolderComparator implements Comparator<Holder> {
        @Override
        public int compare(Holder o1, Holder o2) {
            if (o1.value != o2.value) {
                return -Long.compare(o1.value, o2.value);
            }
            return Integer.compare(o1.type, o2.type);
        }
    }
}
