import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // int q = sc.nextInt();
        int[] h = new int[n];
        int[] a = new int[m];
        int[] b = new int[m];
        // int[] d = new int[q];

        int[] good = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if (h[a[i] - 1] > h[b[i] - 1]) {
                good[b[i] - 1] = -1;
            } else if (h[b[i] - 1] > h[a[i] - 1]) {
                good[a[i] - 1] = -1;
            } else {
                good[a[i] - 1] = -1;
                good[b[i] - 1] = -1;
            }
        }

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (good[i] == 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }

}