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
        boolean[] used = new boolean[N];
        PriorityQueue<Dish> takahashi_list = new PriorityQueue<>(new TakahashiComparator());
        PriorityQueue<Dish> aoki_list = new PriorityQueue<>(new AokiComparator());
        for (int i = 0; i < N; i++) {
            Dish d = new Dish(i, scan.nextInt(), scan.nextInt());
            takahashi_list.add(d);
            aoki_list.add(d);
        }
        long takahashi_point = 0;
        long aoki_point = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                while (!takahashi_list.isEmpty()) {
                    Dish d = takahashi_list.poll();
                    if (used[d.id]) {
                        continue;
                    }
                    used[d.id] = true;
                    takahashi_point += d.A;
                    break;
                }
                continue;
            }
            while (!aoki_list.isEmpty()) {
                Dish d = aoki_list.poll();
                if (used[d.id]) {
                    continue;
                }
                used[d.id] = true;
                aoki_point += d.B;
                break;
            }
        }
        System.out.println(takahashi_point - aoki_point);
    }
    class TakahashiComparator implements Comparator<Dish> {
        @Override
        public int compare(Dish o1, Dish o2) {
            if (o1.A != o2.A) {
                return -Long.compare(o1.A, o2.A);
            }
            long o1_point = o1.A - o1.B;
            long o2_point = o2.A - o2.B;
            if (o1_point != o2_point) {
                return Long.compare(o1_point, o2_point);
            }
            if (o1.B != o2.B) {
                return Long.compare(o1.B, o2.B);
            }
            return Integer.compare(o1.id, o2.id);
        }
    }
    class AokiComparator implements Comparator<Dish> {
        @Override
        public int compare(Dish o1, Dish o2) {
            if (o1.B != o2.B) {
                return -Long.compare(o1.B, o2.B);
            }
            long o1_point = o1.B - o1.A;
            long o2_point = o2.B - o2.A;
            if (o1_point != o2_point) {
                return Long.compare(o1_point, o2_point);
            }
            if (o1.A != o2.A) {
                return Long.compare(o1.A, o2.A);
            }
            return Integer.compare(o1.id, o2.id);
        }
    }
    class Dish {
        int id;
        long A;
        long B;
        Dish(int id, long A, long B) {
            this.id = id;
            this.A = A;
            this.B = B;
        }
    }
}
