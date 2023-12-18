import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] masu = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    masu[i][j] = 0;
                } else {
                    masu[i][j] = a[i] + a[j];
                }
            }
        }
        long ans = 0;
        long count = 0;
        boolean flag = true;
        // long kazu = n * (n - 1) / 2;
        // long cnt = 0;
        while (flag) {
            count = 0;
            // cnt = 0;
            int mama = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (masu[i][j] == 2) {
                        count++;
                    }
                    if (masu[i][j] % 2 == 1) {
                        masu[i][j] = 0;
                    }
                    masu[i][j] = masu[i][j] / 2;
                    if (masu[i][j] == 0) {
                        // cnt++;
                    }
                    if (mama < masu[i][j]) {
                        mama = masu[i][j];
                    }
                }
            }
            if (ans < count) {
                ans = count;
            }
            if (mama == 0) {
                flag = false;
            }
        }
        System.out.println(ans);
    }
}