import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[][] t = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n - 1; i++) {
            int dif0 = t[i][0] - t[i + 1][0];
            for (int j = 1; j < n; j++) {
                int difj = t[i][j] - t[i + 1][j];
                if (dif0 != difj) {
                    System.out.println("No");
                    return;
                }
            }
        }
        
        for (int j = 0; j < n - 1; j++) {
            int dif0 = t[0][j] - t[0][j + 1];
            for (int i = 1; i < n; i++) {
                int difi = t[i][j] - t[i][j + 1];
                if (dif0 != difi) {
                    System.out.println("No");
                    return;
                }
            }
        }
        
        System.out.println("Yes");
    }
}
