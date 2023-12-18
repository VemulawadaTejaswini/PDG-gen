import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] from = new int[n][2];
        for (int i = 0; i < n; i++) {
            from[i][0] = sc.nextInt();
            from[i][1] = sc.nextInt();
        }
        int[][] to = new int[m][2];
        for (int i = 0; i < m; i++) {
            to[i][0] = sc.nextInt();
            to[i][1] = sc.nextInt();
        }
        
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int min = 1001001009;
            int idx = -1;
            for (int j = 0; j < m; j++) {
                int tmp = Math.abs(from[i][0] - to[j][0]) + Math.abs(from[i][1] - to[j][1]);
                
                if (tmp < min) {
                    min = tmp;
                    idx = j;
                }
            }
            
            ans[i] = idx;
        }
        
        for (Integer i : ans) {
            System.out.println(i+1);
        }
    }
}