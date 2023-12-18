import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
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
        HashMap<Integer, Point> map = new HashMap<>();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int A = scan.nextInt();
                map.put(A, new Point(i, j));
            }
        }
        int[] s = new int[H*W+1];
        for (int i = 1; i <= H * W - D; i++) {
            Point p1 = map.get(i);
            Point p2 = map.get(i+D);
            s[i+D] = s[i]
                    + Math.abs(p1.i-p2.i)
                    + Math.abs(p1.j-p2.j);
        }
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            int L = scan.nextInt();
            int R = scan.nextInt();
            System.out.println(s[R]-s[L]);
        }
    }
    class Point {
        int i;
        int j;
        Point(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
