
import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] A = new String[H];
        char[][] a = new char[H][W];
        boolean[][] h = new boolean[H][W];
        boolean[][] w = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                h[i][j] = false;
                w[i][j] = false;
            }
        }
        for (int i = 0; i < H; i++) {
            A[i] = sc.next();
        }
        for (int i = 0; i < H; i++) {
            a[i] = A[i].toCharArray();
        }
        lavel:
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (a[i][j] == '#') {
                    for (int k = 0; k < W; k++) {
                        h[i][k] = true;
                    }
                    continue lavel;
                }
            }
        }
        lavel:
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                if (a[j][i] == '#') {
                    for (int k = 0; k < H; k++) {
                        w[k][i] = true;
                    }
                    continue lavel;
                }
            }
        }
        for (int i = 0; i < H; i++) {
            int c = 0;
            for (int j = 0; j < W; j++) {
                if (h[i][j] && w[i][j]) {
                    System.out.print(a[i][j]);
                } else {
                    c++;
                }
            }
            if (c != W) {                
                System.out.println();
            }
            c = 0;
        }
    }
}
