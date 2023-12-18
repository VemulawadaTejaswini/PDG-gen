import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[0][i] = sc.nextInt();
            sum += a[0][i];
        }
        for (int d = 1; d < n; d++) {
            for (int i = 0; i < n - d; i++) {
                int j = i + d;
                a[d][i] = Math.min(a[d - 1][i], a[0][j]);
                sum += a[d][i];
            }
        }
        System.out.println(sum);
    }
}
