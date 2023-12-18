
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] d = new int[n + 1][n + 1];
        
        for (int i = 0; i < m; i++) {
            int xLi = sc.nextInt();
            int xRi = sc.nextInt();
            int xDi = sc.nextInt();
            if (xLi > xRi) {
                int temp = xLi;
                xLi = xRi;
                xRi = temp;
                xDi = -xDi;
            }
            d[xLi][xRi] = xDi;
        }

        for (int k = 1; k <= n - 2; k++) {
            for (int i = k + 1; i <= n - 1; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (d[k][j] == 0) continue;
                    if (d[k][j] - d[k][i] != d[i][j]) {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}