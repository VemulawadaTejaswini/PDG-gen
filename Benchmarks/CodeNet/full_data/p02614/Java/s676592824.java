

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int h = in.nextInt();
        final int w = in.nextInt();
        final int k = in.nextInt();
        in.nextLine();
        final char[][] g = new char[h][w];
        for (int i = 0; i < h; i++) {
            g[i] = in.nextLine().toCharArray();
        }
        int ans = 0;
        for (int mask = 0; mask < 1 << (w + h); mask++) {
            int count = 0;
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    if (g[i][j] != '#') { continue; }
                    if ((mask & ((1 << i) | (1 << (w + j)))) != 0) { continue; }
                    count++;
                }
            }
            if (count == k) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
