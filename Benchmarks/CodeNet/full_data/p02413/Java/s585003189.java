import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int r = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int[][] a = new int[r+1][c+1];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                a[i][j] = Integer.parseInt(sc.next());
                a[i][c] += a[i][j];
                a[r][j] += a[i][j];
                a[r][c] += a[i][j];
            }
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= c; j++) {
                pw.print(a[i][j]);
                if (j != c) pw.print(" ");
            }
            pw.println();
        }
        pw.flush();
    }
}
