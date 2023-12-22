import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        n = input.nextInt();
        m = input.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                mat[i][j] = input.nextInt();
            }
        }
        int[] vec = new int[m];
        for (int i = 0; i < m; i++){
            vec[i] = input.nextInt();
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                ans[i] += (mat[i][j] * vec[j]);
            }
        }
        for (int i = 0; i < n; i++){
            System.out.println(ans[i]);
        }
    }
}
