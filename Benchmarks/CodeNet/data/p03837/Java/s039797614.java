import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[][] e = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(e[i], 1000 * 1000);
            e[i][i] = 0;
        }
        int[] a = new int[m];
        int[] b = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(sc.next()) - 1;
            b[i] = Integer.parseInt(sc.next()) - 1;
            c[i] = Integer.parseInt(sc.next());
            e[a[i]][b[i]] = c[i];
            e[b[i]][a[i]] = c[i];
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    e[i][j] = Math.min(e[i][j], e[i][k] + e[k][j]);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            if (c[i] > e[a[i]][b[i]]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}