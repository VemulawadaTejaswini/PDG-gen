
import java.util.Scanner;

public class Main {
    private static int C = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int n = sc.nextInt(); n != 0; n = sc.nextInt())
            solve(n);
    }

    private static void solve(int n) {
        int[][] ns = new int[n][n];
        int inc = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = i; j >= 0; j--) {
                    ns[j][i-j] = inc++;
                }
            } else {
                for (int j = 0; j <= i; j++) {
                    ns[j][i-j] = inc++;
                }
            }
        }

        for (int i = n; i < 2 * (n - 1) + 1; i++) {
            if (i % 2 == 1) {
                for (int j = i - n + 1; j < n; j++) {
                    ns[j][i - j] = inc++;
                }
            } else {
                for (int j = n - 1; j >= i - n + 1 ; j--) {
                    ns[j][i - j] = inc++;
                }
            }
        }

        System.out.printf("Case %d:\n", C++);
        for (int[] as : ns) {
            for (int a : as) {
                System.out.printf("%3d ", a);
            }
            System.out.println();
        }
    }
}