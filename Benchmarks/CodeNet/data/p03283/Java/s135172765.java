import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int[][] lr = new int[n][n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            lr[a][b]++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                lr[i][j] += lr[i][j-1];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int q1 = sc.nextInt()-1;
            int q2 = sc.nextInt()-1;
            int tmp =0;
            for (int j = q1; j <= q2; j++) {
                tmp += lr[j][q2];
            }
            sb.append(tmp + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}
