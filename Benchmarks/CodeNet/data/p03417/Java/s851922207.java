import java.util.Scanner;

class C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] *= -1;
                if (j + 1 < m)
                    a[i][j + 1] *= -1;
                if (j - 1 >= 0)
                    a[i][j - 1] *= -1;
                if (i - 1 >= 0) {
                    a[i - 1][j] *= -1;
                    if (j - 1 >= 0) {
                        a[i - 1][j - 1] *= -1;
                    }
                    if (j + 1 < m) {
                        a[i - 1][j + 1] *= -1;
                    }
                }

                if (i + 1 < n) {
                    a[i + 1][j] *= -1;
                    if (j + 1 < m) {
                        a[i + 1][j + 1] *= -1;
                    }
                    if (j - 1 >= 0) {
                        a[i + 1][j - 1] *= -1;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (a[i][j] == -1)
                    count++;
        System.out.println(count);
        input.close();
    }
}