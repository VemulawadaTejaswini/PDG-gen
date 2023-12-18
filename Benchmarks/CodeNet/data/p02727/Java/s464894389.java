
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
        PriorityQueue<Holder> q = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < A; i++) {
            q.add(new Holder(scan.nextInt(), 0));
        }
        for (int i = 0; i < B; i++) {
            q.add(new Holder(scan.nextInt(), 1));
        }
        for (int i = 0; i < C; i++) {
            q.add(new Holder(scan.nextInt(), 2));
        }
        long ans = 0;
        int[] remain = {X, Y};
        int ate_white = 0;
        while (remain[0] + remain[1] > ate_white) {
            Holder h = q.poll();
            if (h.type == 2) {
                ans += h.value;
                ate_white += 1;
                continue;
            }
            if (0 < remain[h.type]) {
                ans += h.value;
                remain[h.type] -= 1;
            }
        }
        System.out.println(ans);
    }
    class Holder implements Comparable<Holder> {
        int value;
        int type;
        Holder(int value, int type) {
            this.value = value;
            this.type = type;
        }

        @Override
        public int compareTo(Holder o) {
            if (this.value != o.value) {
                return Integer.compare(this.value, o.value);
            }
            return Integer.compare(this.type, o.type);
        }
    }
}
