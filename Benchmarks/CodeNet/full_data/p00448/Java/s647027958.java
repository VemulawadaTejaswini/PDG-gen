import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }
    Scanner sc;
    Main(){
        sc = new Scanner(System.in);
    }
    void debug(Object ... o) {
        System.out.println(Arrays.deepToString(o));
    }
    void run() {
        while (init()) {
            int ans = 0;
            for (int bit = 0; bit < (1<<R); bit++) {
                makeG(bit);
                int cans = 0; // current answer
                for (int i = 0; i < C; i++) {
                    cans += countMax(i);
                }
                ans = Math.max(ans, cans);
            }
            System.out.println(ans);
        }
    }
    int R, C;
    boolean [][] F;
    boolean [][] G;
    int countMax(int j) {
        int t = 0, f = 0;
        for (int i = 0; i < R; i++) {
            if (G[i][j]) {
                t++;
            } else {
                f++;
            }
        }
        return Math.max(t, f);
    }
    void makeG(int bit) {
        G = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            if ((bit & (1 << i)) != 0) {
                for (int j = 0; j < C; j++) {
                    G[i][j] = !F[i][j];
                }
            } else {
                for (int j = 0; j < C; j++) {
                    G[i][j] = F[i][j];
                }
            }
        }
    }
    boolean init() {
        R = sc.nextInt();
        C = sc.nextInt();
        if (R == 0 && C == 0) return false;
        F = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int n = sc.nextInt();
                F[i][j] = (n == 1);
            }
        }
        return true;
    }
}