import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int D = scan.nextInt();
        Map<Integer, Point> map = new HashMap<>();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int A = scan.nextInt();
                Point p = new Point(i, j);
                map.put(A, p);
            }
        }
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            int L = scan.nextInt();
            int R = scan.nextInt();
            int ans = 0;
            int current = L;
            while (current != R) {
                Point p = map.get(current);
                Point n = map.get(current + D);
                ans += Math.abs(p.x - n.x) + Math.abs(p.y - n.y);
                current = current + D;
            }
            System.out.println(ans);
        }
    }
    class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
