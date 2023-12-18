import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int h = std.nextInt();
        int w = std.nextInt();
        int[][] table = new int[h][w];
        for (int i = 0; i < h; i++) {
            String s = std.next();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                table[i][j] = (c == '#') ? 1:0;
            }
        }

        int[][] ldp = new int[h][w];
        int[][] rdp = new int[h][w];
        int[][] tdp = new int[h][w];
        int[][] bdp = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (table[i][j] == 1) {
                    ldp[i][j] = 0;
                    tdp[i][j] = 0;
                    continue;
                }

                if (j == 0) {
                    ldp[i][j] = 1;
                } else {
                    ldp[i][j] = ldp[i][j - 1] + 1;
                }

                if (i == 0) {
                    tdp[i][j] = 1;
                } else {
                    tdp[i][j] = tdp[i - 1][j] + 1;
                }
            }
        }

        for (int i = h - 1; i >= 0; i--) {
            for (int j = w - 1; j >= 0; j--) {
                if (table[i][j] == 1) {
                    rdp[i][j] = 0;
                    bdp[i][j] = 0;
                    continue;
                }

                if (j == w - 1) {
                    rdp[i][j] = 1;
                } else {
                    rdp[i][j] = rdp[i][j + 1] + 1;
                }

                if (i == h - 1) {
                    bdp[i][j] = 1;
                } else {
                    bdp[i][j] = bdp[i + 1][j] + 1;
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                long value = ldp[i][j] + rdp[i][j] + tdp[i][j] + bdp[i][j] - 3;
                ans = Math.max(ans, value);
            }
        }

        System.out.println(ans);
    }
}
