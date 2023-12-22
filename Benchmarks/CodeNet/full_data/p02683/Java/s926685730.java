import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int X = scanner.nextInt();

        int[][] books = new int[N][M + 1];
        int[] sum = new int[M + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= M; j++) {
                books[i][j] = scanner.nextInt();
                sum[j] += books[i][j];
            }
        }
        scanner.close();

        if (sum[1] < X || sum[2] < X || sum[3] < X) {
            System.out.println("-1");
            return;
        }

        Arrays.sort(books, (a, b) -> Double.compare(a[0], b[0]));

        while (true) {

            boolean isOk = true;
            for (int i = N - 1; i >= 0; i--) {
                boolean temp = true;
                for (int j = 1; j <= M; j++) {
                    if (sum[j] - books[i][j] < X) {
                        temp = false;
                        break;
                    }
                }

                if (temp) {
                    for (int j = 0; j <= M; j++) {
                        sum[j] -= books[i][j];

                    }
                    isOk = false;
                }
            }

            if (isOk) {
                System.out.println(sum[0]);
                return;
            }
        }

    }
}