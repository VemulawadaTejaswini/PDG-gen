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
        int K = scan.nextInt();
        char[][] map = new char[H][W];
        for (int i = 0; i < H; i++) {
            String s = scan.next();
            map[i] = s.toCharArray();
        }
        int[][] ans = solve(H, W, K, map);
        for (int i = 0; i < H; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < W; j++) {
                sb.append(ans[i][j]);
                sb.append(" ");
            }
            System.out.println(sb.substring(0, sb.length()-1));
        }
    }
    private int[][] solve(int H, int W, int K, char[][] map) {
        int[] Y = new int[H];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (map[i][j] == '#') {
                    Y[i] += 1;
                }
            }
        }
        int[] sY = new int[H+1];
        for (int i = 0; i < H; i++) {
            sY[i+1] = sY[i] + Y[i];
        }
        for (int i = H; 0 < i; i--) {
            if (0 < sY[i]) {
                continue;
            }
            sY[i] = sY[i+1];
        }
        int[][] result = new int[H][W];
        int cnt = 0;
        int prev = 0;
        int prevS = 0;
        for (int i = 0; i < H - 1; i++) {
            if (sY[i+1] == sY[i+2]) {
                continue;
            }
            result = sub(result, W, map, prev, i, cnt+1);
            cnt += sY[i+1]-prevS;
            prev = i + 1;
            prevS = sY[i+1];
        }
        if (cnt < K) {
            result = sub(result, W, map, prev, H-1, cnt+1);
        }
        return result;
    }
    private int[][] sub(int[][] result, int W, char[][] map, int from, int to, int index) {
        int[] X = new int[W];
        for (int i = 0; i < W; i++) {
            for (int j = from; j <= to; j++) {
                if (map[j][i] == '#') {
                    X[i] += 1;
                }
            }
        }
        int[] sX = new int[W+1];
        for (int i = 0; i < W; i++) {
            sX[i+1] = sX[i] + X[i];
        }
        for (int i = W; 0 < i; i--) {
            if (0 < sX[i]) {
                continue;
            }
            sX[i] = sX[i+1];
        }
        int target = sX[1];
        for (int i = 0; i < W; i++) {
            if (target != sX[i+1]) {
                index += 1;
                target = sX[i+1];
            }
            for (int j = from; j <= to; j++) {
                result[j][i] = index;
            }
        }
        return result;
    }
}
