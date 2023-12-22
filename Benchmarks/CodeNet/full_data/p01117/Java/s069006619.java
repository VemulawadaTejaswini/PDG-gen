import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());

            if (n == 0 && m == 0) {
                break;
            }
            int[][] Scores = new int[n][m];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    Scores[j][i] = Integer.parseInt(sc.next());
                }
            }
            int max = 0;
            int sum;
            for (int i = 0; i < n; i++) {
                sum = 0;
                for (int j = 0; j < m; j++) {
                    sum += Scores[i][j];
                }
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println(max);
        }
                               
    }
}

