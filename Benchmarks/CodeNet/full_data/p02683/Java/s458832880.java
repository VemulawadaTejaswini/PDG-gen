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

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            boolean temp = true;

            for (int j = 0; j <= M; j++) {
                books[i][j] = scanner.nextInt();
                sum[j] += books[i][j];

                if (j != 0 && books[i][j] < X) {
                    temp = false;
                }
            }

            if (temp && books[i][0] < min) {
                min = books[i][0];
            }
        }
        scanner.close();

        for (int j = 1; j <= M; j++) {
            if (sum[j] < X) {
                System.out.println("-1");
                return;
            }
        }

        Arrays.sort(books, (a, b) -> -Integer.compare(a[0], b[0]));

        while (true) {

            boolean isOk = true;
            Loop: for (int i = 0; i < N; i++) {
                boolean temp = true;
                for (int j = 1; j <= M; j++) {
                    if (sum[j] - books[i][j] < X) {
                        temp = false;
                        continue Loop;
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
                System.out.println(Math.min(sum[0], min));
                return;
            }
        }

    }
}