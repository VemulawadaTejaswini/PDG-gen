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
                    set.add(info.estimate(i, j));
                }
                if (set.size() == 1) {
                    cx = i;
                    cy = j;
                    for (int x : set) {
                        ch = x;
                        break;
                    }
                }
            }
        }
        System.out.println(cx + " " + cy + " " + ch);
    }
    class Info {
        int x;
        int y;
        int h;
        int estimate(int px, int py) {
            return h + Math.abs(px-x) + Math.abs(py-y);
        }
    }
}
