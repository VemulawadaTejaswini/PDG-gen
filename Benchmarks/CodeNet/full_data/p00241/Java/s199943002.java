import java.io.*;
import java.util.*;

public class Main {
    Scanner sc;

    Main() {
        sc = new Scanner(System.in);
    }

    int n;
    
    boolean init() {
        n = sc.nextInt();
        if (n == 0) return false;
        return true;
    }

    int[] a;
    int[] b;
    void solve() {
        a = new int[4];
        b = new int[4];
        for (int i = 0; i < 4; i++) a[i] = sc.nextInt();
        for (int i = 0; i < 4; i++) b[i] = sc.nextInt();

        // 実数部
        int r = a[0] * b[0] - a[1] * b[1] - a[2] * b[2] - a[3] * b[3];
        // i
        int i = a[0] * b[1] + a[1] * b[0] + a[2] * b[3] - a[3] * b[2];
        // j
        int j = a[0] * b[2] - a[1] * b[3] + a[2] * b[0] + a[3] * b[1];
        // k
        int k = a[0] * b[3] + a[1] * b[2] - a[2] * b[1] + a[3] * b[0];

        System.out.printf("%d %d %d %d\n", r, i, j, k);
    }

    void run() {
        while (init()) {
            for (int i = 0; i < n; i++) 
                solve();
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}