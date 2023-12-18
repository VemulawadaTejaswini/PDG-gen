import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] k = new int[n];
        int[][] a = new int[n][m];
        int[] count = new int[m];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            k[i] = sc.nextInt();
            for (int j = 0; j < k[i]; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k[i]; j++) {
                count[a[i][j] - 1]++;
            }
        }
        for (int i = 0; i < m; i++) {
            if (count[i] == n)
                ans++;
        }
        System.out.println(ans);
    }
}