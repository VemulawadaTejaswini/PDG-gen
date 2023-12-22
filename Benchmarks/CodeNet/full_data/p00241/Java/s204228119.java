import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] l = { { 1, 2, 3, 4 }, { 2, -1, 4, -3 }, { 3, -4, -1, 2 }, { 4, 3, -2, -1 } };
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] a = new int[8];
            while (n-- > 0) {
                int[] r = new int[5];
                for (int i = 0; i < 8; i++) {
                    a[i] = sc.nextInt();
                }
                for (int i = 0; i < 4; i++) {
                    for (int j = 4; j < 8; j++) {
                        r[Math.abs(l[i][j - 4])] += a[i] * a[j] *(l[i][j - 4] >= 0 ? 1 : -1) ;
                    }
                }
                for (int i = 1; i < 5; i++) {
                    System.out.print(r[i] + (i == 4 ? "\n" : " "));
                }
            }
        }
    }
}
