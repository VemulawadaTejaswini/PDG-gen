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
        List<Info> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int h = scan.nextInt();
            Info info = new Info();
            info.x = x;
            info.y = y;
            info.h = h;
            list.add(info);
        }
        int cx = 0;
        int cy = 0;
        int ch = 0;
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                HashSet<Integer> set = new HashSet<>();
                for (int k = 0; k < N; k++) {
                    Info info = list.get(k);
                    if (0 < info.h) {
                        set.add(info.estimate(i, j));
                    }
                }
                if (set.size() != 1) {
                    continue;
                }
                cx = i;
                cy = j;
                for (int x : set) {
                    ch = x;
                }
                boolean ng = false;
                for (int k = 0; k < N; k++) {
                    Info info = list.get(k);
                    if (!info.match(cx, cy, ch)) {
                        ng = true;
                        break;
                    }
                }
                if (ng) {
                    continue;
                }
                System.out.println(cx + " " + cy + " " + ch);
                return;
            }
        }
    }
    class Info {
        int x;
        int y;
        int h;
        int estimate(int px, int py) {
            return h + Math.abs(px-x) + Math.abs(py-y);
        }
        boolean match(int px, int py, int ph) {
            return h == Math.max(ph - Math.abs(px-x) - Math.abs(py-y),0);
        }
    }
}
