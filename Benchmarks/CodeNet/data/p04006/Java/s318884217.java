import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextInt();
        int[][] allType = new int[n][n];
        long min = 0;
        for (int i = 0; i < n; i++) {
            allType[0][i] = sc.nextInt();
            min += allType[0][i];
        }
        for (int i = 1; i < n; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                allType[i][j] = Math.min(allType[i - 1][j], allType[0][(j - i + n) % n]);
                sum += allType[i][j];
            }
            min = Math.min(min, sum + i * x);
        }
        System.out.println(min);
    }
}
