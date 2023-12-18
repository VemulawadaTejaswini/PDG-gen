import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] field = new char[h][];
        int[][] horCounts = new int[h][w];
        for (int i = 0; i < h; i++) {
            field[i] = sc.next().toCharArray();
            int left = -1;
            int[] lefts = new int[w];
            for (int j = 0; j < w; j++) {
                if (field[i][j] == '#') {
                    left = j;
                }
                lefts[j] = left;
            }
            int right = w;
            for (int j = w - 1; j >= 0; j--) {
                if (field[i][j] == '#') {
                    right = j;
                }
                horCounts[i][j] = right - lefts[j] - 1;
            }
        }
        int[][] verCounts = new int[h][w];
        for (int i = 0; i < w; i++) {
            int up = -1;
            int[] ups = new int[h];
            for (int j = 0; j < h; j++) {
                if (field[j][i] == '#') {
                    up = j;
                }
                ups[j] = up;
            }
            int down = h;
            for (int j = h - 1; j >= 0; j--) {
                if (field[j][i] == '#') {
                    down = j;
                }
                verCounts[j][i] = down - ups[j] - 1;
            }
        }
        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                max = Math.max(max, horCounts[i][j] + verCounts[i][j] - 1);
            }
        }
        System.out.println(max);
    }
}