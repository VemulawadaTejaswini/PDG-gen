import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Collections;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int mod = 1000000007; 
    public static void main(String[] args) throws Exception {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int dp[][] = new int[h][w];
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i >= h - a && j < b) {
                    System.out.println(i + " " + j);
                    dp[i][j] = 0;
                } else if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    int sum = dp[i-1][j] + dp[i][j-1];
                    dp[i][j] = sum % mod;
                }
            }
        }
        
        System.out.println(dp[h-1][w-1]);
    }
}
