import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        PriorityQueue<Pair> queue = new PriorityQueue<>(new PairComparator());
        for (int i = 0; i < N; i++) {
            long x = scan.nextLong();
            queue.add(new Pair(0, N - 1, x, i));
        }
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        int len = N;
        long ans = 0;
        while(!queue.isEmpty()) {
            Pair p = queue.poll();
            int first = list.get(0);
            int last = list.get(len-1);
            long d1 = Math.abs(p.index - first);
            long d2 = Math.abs(p.index - last);
            boolean use_last = false;
            if (d1 < d2) {
                ans += p.x * d2;
                list.remove(len-1);
                use_last = true;
            } else {
                ans += p.x * d1;
                list.remove(0);
            }
            len -= 1;
            if (queue.isEmpty()) {
                break;
            }
            if (use_last) {
                last = list.get(len-1);
            } else {
                first = list.get(0);
            }
            PriorityQueue<Pair> next_queue = new PriorityQueue<>(new PairComparator());
            while(!queue.isEmpty()) {
                Pair y = queue.poll();
                next_queue.add(new Pair(first, last, y.x, y.index));
            }
            queue = next_queue;
        }
        System.out.println(ans);
    }
    class Pair {
        long x;
        long index;
        long power;
        Pair(long first, long last, long x, long index) {
            this.x = x;
            this.index = index;
            this.power = Math.max(Math.abs(index - first),Math.abs(index - last)) * x;
        }
    }
    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.power != o2.power) {
                return -Long.compare(o1.power, o2.power);
            }
            if (o1.x != o2.x) {
                return -Long.compare(o1.x, o2.x);
            }
            return Long.compare(o1.index, o2.index);
        }
    }
}
