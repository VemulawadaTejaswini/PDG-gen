import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        boolean[][] c = new boolean[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (b[i] == a[j][k]) {
                        c[j][k] = true;
                        break;
                    }
                }
            }
        }
        if (c[0][0] && c[0][1] && c[0][2] || c[1][0] && c[1][1] && c[1][2] || c[2][0] && c[2][1] && c[2][2]
                || c[0][0] && c[1][0] && c[2][0] || c[0][1] && c[1][1] && c[2][1] || c[0][1] && c[1][1] && c[2][1]
                || c[0][0] && c[1][1] && c[2][2] || c[0][2] && c[1][1] && c[2][0]) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
