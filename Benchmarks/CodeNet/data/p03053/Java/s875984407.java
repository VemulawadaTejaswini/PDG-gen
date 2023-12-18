import java.util.*;
import java.io.*;
import java.util.function.*;
// import lib.util.*;
// import lib.graph.*;
// import lib.io.*;
// import lib.math.*;

public class Main {

    public static void main(String[] args) {
        // FastScanner sc = new FastScanner();
        Scanner sc = new Scanner(System.in);
        // PrintWriter out = new PrintWriter(System.out);

        int H = sc.nextInt();
        int W = sc.nextInt();
        boolean[][] A = new boolean[H][W];
        boolean comp = true;
        ;
        for (int j = 0; j < W; j++) {
            char[] s = sc.next().toCharArray();
            for (int i = 0; i < H; i++) {
                A[i][j] = (s[i] == '#');
                if (!A[i][j]) {
                    comp = false;
                }
            }
        }
        int res = 0;
        // debug(A);
        // System.out.println();
        while (!comp) {
            res++;
            comp = true;

            boolean[][] changed = new boolean[H][W];
            for (int j = 0; j < W; j++) {
                for (int i = 0; i < H; i++) {
                    if (!A[i][j]) {
                        if (0 <= i - 1) {
                            if (A[i - 1][j] && !changed[i - 1][j]) {
                                A[i][j] = true;
                                changed[i][j] = true;
                            }
                        }
                        if (i + 1 < H) {
                            if (A[i + 1][j] && !changed[i + 1][j]) {
                                A[i][j] = true;
                                changed[i][j] = true;
                            }
                        }
                        if (0 <= j - 1) {
                            if (A[i][j - 1] && !changed[i][j - 1]) {
                                A[i][j] = true;
                                changed[i][j] = true;
                            }
                        }
                        if (j + 1 < W) {
                            if (A[i][j + 1] && !changed[i][j + 1]) {
                                A[i][j] = true;
                                changed[i][j] = true;
                            }
                        }
                    }
                    if (!A[i][j]) {
                        comp = false;
                    }
                }
            }
            // debug(A);
            // System.out.println();
        }
        System.out.println(res);

    }

    public static void debug(boolean[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

}