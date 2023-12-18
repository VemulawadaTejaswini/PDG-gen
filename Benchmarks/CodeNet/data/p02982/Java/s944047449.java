import java.util.Scanner;

public class Main {
    static int N;
    static int D;
    static int[][] x;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        D = scanner.nextInt();

        x = new int[N][D];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                x[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int sum = 0;
                for (int k = 0; k < D; k++) {
                    sum += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
                }
                double sq = Math.sqrt(sum);
                if(Math.abs(sq - Math.round(sq)) < Double.MIN_VALUE) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}