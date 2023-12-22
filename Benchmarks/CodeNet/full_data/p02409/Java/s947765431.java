import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(sc.next());
        int[][][] residents = new int[4][3][10];
        for (int i = 0; i < n; i++) {
            int b = Integer.parseInt(sc.next());
            int f = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            int v = Integer.parseInt(sc.next());
            residents[b-1][f-1][r-1] += v;
        }

        for (int i = 0; i < 4; i++) {
            if (i != 0) {
                out.printf("####################\n");
            }
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    out.printf(" %d", residents[i][j][k]);
                }
                out.printf("\n");
            }
        }
        out.flush();
    }
}
