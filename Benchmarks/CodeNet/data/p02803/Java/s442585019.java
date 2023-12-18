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
        int H = scan.nextInt();
        int W = scan.nextInt();
        char[][] map = new char[H][W];
        for (int i = 0; i < H; i++) {
            String s = scan.next();
            map[i] = s.toCharArray();
        }
        int limit = H * W;
        int[][] distance = new int[limit][limit];
        for (int i = 0; i < limit; i++) {
            Arrays.fill(distance[i], Integer.MAX_VALUE);
        }
        for (int i = 0; i < H; i++) {
            for (int j = 1; j < W; j++) {
                if (map[i][j-1] == '.'&& map[i][j] == '.') {
                    distance[i * W + j-1][i * W + j] = 1;
                    distance[i * W + j][i * W + j-1] = 1;
                }
            }
        }
        for (int j = 0; j < W; j++) {
            for (int i = 1; i < H; i++) {
                if (map[i-1][j] == '.'&& map[i][j] == '.') {
                    distance[(i -1) * W + j][i * W + j] = 1;
                    distance[i * W + j][(i - 1) * W + j] = 1;
                }
            }
        }
        int[][] min_distance = new int[limit][limit];
        for (int i = 0; i < limit; i++) {
            Arrays.fill(min_distance[i], Integer.MAX_VALUE);
        }
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {
                min_distance[i][j] = distance[i][j];
            }
        }
        for (int k = 0; k < limit; k++) {
            for (int i = 0; i < limit; i++) {
                for (int j = 0; j < limit; j++) {
                    if (min_distance[i][k] == Integer.MAX_VALUE) {
                        continue;
                    }
                    if (min_distance[k][j] == Integer.MAX_VALUE) {
                        continue;
                    }
                    min_distance[i][j] = Math.min(min_distance[i][j], min_distance[i][k] + min_distance[k][j]);
                }
            }
        }
        if (limit <= 2) {
            System.out.println(1);
            return;
        }
        int answer = 0;
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {
                if (min_distance[i][j] == Integer.MAX_VALUE) {
                    continue;
                }
                answer = Math.max(answer, min_distance[i][j]);
            }
        }
        System.out.println(answer);
    }
    class Position {
        int r = 0;
        int c = 0;
        Position(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
