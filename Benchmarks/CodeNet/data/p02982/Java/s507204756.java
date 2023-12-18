
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[][] points = new int[n][d];
        for (int i = 0; i < n; ++i) {
            points[i] = new int[d];
            for (int j = 0; j < d; ++j) {
                points[i][j] = scanner.nextInt();
            }
        }
        int[] ok = new int[40005];
        for (int i = 0; i < 200; ++i) {
            ok[i * i] = 1;
        }
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int dis = 0;
                for (int k = 0; k < d; ++k) {
                    dis += (points[i][k] - points[j][k]) * (points[i][k] - points[j][k]);
                }
                if (ok[dis] == 1) {
                    ++ans;
                }
            }
        }
        System.out.println(ans);

    }

}
