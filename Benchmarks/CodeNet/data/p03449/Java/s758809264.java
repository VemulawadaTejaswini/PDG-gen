import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        
        int[][] ans = new int[2][n];
        ans[0][0] = array[0][0];
        for (int i = 0; i < n-1; i++) {
            ans[0][i+1] = ans[0][i] + array[0][i+1];
        }
        ans[1][0] = array[0][0] + array[1][0];
        for (int i = 1; i < n; i++) {
            ans[1][i] = Math.max(ans[0][i], ans[1][i-1]) + array[1][i];
        }
        System.out.println(ans[1][n-1]);
    }
}
