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
        long H = scan.nextLong();
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Pair p = new Pair(scan.nextInt(), scan.nextInt());
            pairs.add(p);
        }
        Pair max_pair = null;
        for (Pair p : pairs) {
            if (max_pair == null) {
                max_pair = p;
                continue;
            }
            if (max_pair.a < p.a) {
                max_pair = p;
            }
        }
        List<Long> b = new ArrayList<>();
        for (Pair p : pairs) {
            if (p.b < max_pair.a) {
                continue;
            }
            b.add(p.b);
        }
        b.sort(Comparator.reverseOrder());
        long current = 0;
        long count = 0;
        long answer = (H + max_pair.a - 1) / max_pair.a;
        for (int i = 0; i < b.size(); i++) {
            current += b.get(i);
            count += 1;
            if (H <= current) {
                break;
            }
        }
        if (current < H) {
            count += (H - current + max_pair.a - 1) / max_pair.a;
        }
        answer = Math.min(answer, count);
        System.out.println(answer);
    }
    class Pair {
        long a;
        long b;
        Pair(long a, long b) {
            this.a = a;
            this.b = b;
        }
    }
}
