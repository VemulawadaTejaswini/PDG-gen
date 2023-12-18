import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int W = scan.nextInt();
        int H = scan.nextInt();
        int N = scan.nextInt();
        int[][] map = new int[H+1][W+1];
        int min_x = 0;
        int max_x = W;
        int min_y = 0;
        int max_y = H;
        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int a = scan.nextInt();
            if (a == 1) {
                min_x = Math.max(min_x, x);
            }
            if (a == 2) {
                max_x = Math.min(max_x, x);
            }
            if (a == 3) {
                min_y = Math.max(min_y, y);
            }
            if (a == 4) {
                max_y = Math.min(max_y, y);
            }
        }
        if (max_x <= min_x || max_y <= min_y) {
            System.out.println(0);
        } else {
            System.out.println((max_x - min_x) * (max_y - min_y));
        }
    }
}
