import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] c = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = sc.nextInt();
            }
        }

        int[] a = new int[3];
        int[] b = new int[3];

        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                for (int k = 0; k <= 100; k++) {
                    a[0] = i;
                    a[1] = j;
                    a[2] = k;

                    b[0] = c[0][0] - i;
                    b[1] = c[0][1] - i;
                    b[2] = c[0][2] - i;

                    if (check(a, b, c)) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }
        System.out.println("No");
    }

    static boolean check(int a[], int b[], int c[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i] + b [j] != c[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
