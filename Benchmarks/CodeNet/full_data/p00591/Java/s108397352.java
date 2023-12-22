import java.io.*;
import java.util.*;

public class Main {
    int n;
    int[][] h;
    boolean[][] r, l;
    Scanner sc;
    static int INF = 1<<28;

    Main() {
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new Main().run();
    }

    boolean init() {
        n = sc.nextInt();
        if (n == 0) return false;
        h = new int[n][n];
        r = new boolean[n][n];
        l = new boolean[n][n];
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                h[i][j] = sc.nextInt();
        return true;
    }

    void run() {
        while (init()) {
            // each row
            for (int i = 0; i < n; i++) {
                int min_h = INF;
                for (int j = 0; j < n; j++) 
                    if (min_h > h[i][j]) min_h = h[i][j];
                for (int j = 0; j < n; j++) 
                    if (h[i][j] == min_h) r[i][j] = true;
            }

            // each column
            for (int j = 0; j < n; j++) {
                int max_h = 0;
                for (int i = 0; i < n; i++) 
                    if (max_h < h[i][j]) max_h = h[i][j];
                for (int i = 0; i < n; i++) 
                    if (h[i][j] == max_h) l[i][j] = true;
            }

            boolean found = false;
find_target:
            for (int i = 0; i < n; i++) 
                for (int j = 0; j < n; j++) 
                    if (r[i][j] && l[i][j]) {
                        found = true;
                        System.out.println(h[i][j]);
                        break find_target;
                    }
            if (!found) System.out.println("0");
        }
    }
}