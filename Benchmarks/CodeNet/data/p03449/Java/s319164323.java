import java.util.*;

public class Main {
    static int n;
    static int a[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[2][n];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(0, 0));
    }

    public static int solve(int i, int j) {
        int max = 0;

        if (i == 1 && j == n - 1) {
            max = a[i][j];
        } else if (i < 1 && j < n - 1) {
            max = Math.max(a[i][j] + solve(i + 1, j), a[i][j] + solve(i, j + 1));
        } else if (i < 1) {
            max = a[i][j] + solve(i + 1, j);
        } else if (j < n - 1) {
            max = a[i][j] + solve(i, j + 1);
        }
        return max;
    }
}
