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
        
        int dp1[][] = new int[h-a][w];
        int dp2[][] = new int[a][w-b];
        
        for (int i = 0; i < h-a; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 || j == 0) {
                    dp1[i][j] = 1;
                } else {
                    int sum = dp1[i-1][j] + dp1[i][j-1];
                    dp1[i][j] = sum % mod;
                }
                
                if (i == h-a-1 && j >= b) {
                    if (j == b) {
                        dp2[0][0] = dp1[i][j];
                    } else {
                        dp2[0][j-b] = dp1[i][j] + dp2[0][j-b-1];
                    }
                }
            }
        }
            
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < w-b; j++) {
                if (i != 0) {
                    if (j == 0) {
                        dp2[i][j] = dp2[i-1][j];
                    } else {
                        int sum = dp2[i-1][j] + dp2[i][j-1];
                        dp2[i][j] = sum % mod;
                    }
                }
            }
        }

        System.out.println(dp2[a-1][w-b-1]);
    }
}
