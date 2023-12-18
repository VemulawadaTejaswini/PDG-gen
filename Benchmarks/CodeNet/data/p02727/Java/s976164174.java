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
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        List<Long> p = new ArrayList<>();
        List<Long> q = new ArrayList<>();
        List<Long> r = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            p.add(scan.nextLong());
        }
        for (int i = 0; i < B; i++) {
            q.add(scan.nextLong());
        }
        for (int i = 0; i < C; i++) {
            r.add(scan.nextLong());
        }
        p.sort(Comparator.naturalOrder());
        q.sort(Comparator.naturalOrder());
        PriorityQueue<Long> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = A - X; i < A; i++) {
            queue.add(p.get(i));
        }
        for (int i = B - Y; i < B; i++) {
            queue.add(q.get(i));
        }
        for (long target : r) {
            queue.add(target);
        }
        long ans = 0;
        for (int i = 0; i < X + Y; i++) {
            ans += queue.poll();
        }
        System.out.println(ans);
    }
}
