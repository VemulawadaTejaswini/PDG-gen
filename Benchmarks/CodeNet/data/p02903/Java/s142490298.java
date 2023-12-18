import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        int A = scan.nextInt();
        int B = scan.nextInt();
        if (H == 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < W; i++) {
                if (i < A) {
                    sb.append(0);
                } else {
                    sb.append(1);
                }
            }
            System.out.println(sb);
            return;
        }
        if (W == 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < H; i++) {
                if (i < B) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            }
            System.out.println(sb);
            return;
        }
        int[][] map = new int[H][W];
        int dx = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (dx <= j && j < dx + A) {
                    map[i][(dx + j) % W] = 0;
                } else {
                    map[i][(dx + j) % W] = 1;
                }
            }
            if (B != 0 && (i + 1) % B == 0) {
                dx += 1;
            }
        }
        int[][] row = new int[H][2];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                row[i][map[i][j]] += 1;
            }
        }
        int[][] col = new int[W][2];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                col[j][map[i][j]] += 1;
            }
        }
        boolean found = true;
        for (int i = 0; i < H; i++) {
            int simRow = Math.min(row[i][0],row[i][1]);
            if (simRow != A) {
                found = false;
                break;
            }
        }
        for (int i = 0; i < W; i++) {
            int simCol = Math.min(col[i][0],col[i][1]);
            if (simCol != B) {
                found = false;
                break;
            }
        }
        if (!found) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < H; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < W; j++) {
                sb.append(map[i][j]);
            }
            System.out.println(sb.toString());
        }
    }
}
