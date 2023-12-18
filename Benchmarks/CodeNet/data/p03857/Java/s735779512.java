import java.util.Scanner;

public class Main {
    static int n, k, l;
    static boolean[][][] d;
    static int[] c;
    static int[][] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt(); l = sc.nextInt();
        d = new boolean[n][n][2];
        c = new int[n];
        check = new int[n][2];

        for (int i = 0; i < k; i++) {
            int p = sc.nextInt() - 1, q = sc.nextInt() - 1;
            d[p][q][0] = d[q][p][0] = true;
        }

        for (int i = 0; i < l; i++) {
            int p = sc.nextInt() - 1, q = sc.nextInt() - 1;
            d[p][q][1] = d[q][p][1] = true;
        }

        connect();

        for (int i = 0; i < n-1; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println(c[n-1]);
    }

    private static void connect() {
        for (int i = 0; i < n; i++) {
            if (check[i][0]==0) {
                dfs_r(i);
                for (int j = 0; j < n; j++) {
                    if (check[j][0] == 1) {
                        for (int m = 0; m < n; m++) {
                            if (check[m][0] == 1) {
                                d[j][m][0] = true;
                            }
                        }
                    }
                }
            }
            if (check[i][1]==0) {
                dfs_t(i);
                for (int j = 0; j < n; j++) {
                    if (check[j][1] == 1) {
                        for (int m = j; m < n; m++) {
                            if (check[m][1] == 1) {
                                d[j][m][1] = true;
                            }
                        }
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                if (check[j][0]==1) check[j][0]++;
                if (check[j][1]==1) check[j][1]++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (d[i][j][0]&&d[i][j][1]) c[i]++;
            }
        }
    }

    private static void dfs_r(int i) {
        check[i][0] = 1;
        for (int j = 0; j < n; j++) {
            if (d[i][j][0]&&check[j][0]==0){
                dfs_r(j);
            }
        }
    }

    private static void dfs_t(int i) {
        check[i][1] = 1;
        for (int j = 0; j < n; j++) {
            if (d[i][j][1]&&check[j][1]==0){
                dfs_t(j);
            }
        }
    }
}
