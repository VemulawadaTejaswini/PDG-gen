import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 一回素直にやってみる

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] b = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                // 隣り合ったますをカウントする
                for (int k = -1; k < 2; k++) {
                    for (int l = -1; l < 2; l++) {
                        if ((i + k) < N && 0 <= (i + k)) {
                            if ((j + l) < M && 0 <= (j + l)) {
                                b[i][j]++;
                            }
                        }
                    }
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (b[i][j] % 2 == 1) cnt++;
            }
        }

        System.out.println(cnt);
    }

}

