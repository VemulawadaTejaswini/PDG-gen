
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        int[][] X = new int[N][D];
        for(int j = 0; j < N; j++) {
            for (int i = 0; i < D; i++) {
                X[j][i] = scanner.nextInt();
            }
        }

        int count = 0;
        for(int k = 0; k < N; k++) {
            for(int j = k; j < N; j++) {
                if(k == j) continue;
                int tmp = 0;
                for (int i = 0; i < D; i++) {
                    tmp += (X[k][i] - X[j][i]) * (X[k][i] - X[j][i]);
                }
                double ans = Math.sqrt((double) tmp);
                if (ans == (int) ans) count++;
            }
        }


        System.out.println(count);
    }
}