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
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < D; j++) {
                x[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        int ans = 0;
        for(int i = 0; i < N; i++) {
            double res = 0;
            for(int j = 0; j < D; j++) {
                if(i == N - 1) {
                    res += Math.pow(Math.abs(x[i][j] - x[0][j]), 2);
                } else {
                    res += Math.pow(Math.abs(x[i][j] - x[i + 1][j]), 2);
                }
            }
            res = Math.sqrt(res);
            if(res == Math.floor(res)) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}