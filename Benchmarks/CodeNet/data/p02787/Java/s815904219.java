import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int dp[] = new int[h+1];
        Arrays.fill(dp, 100000000);
        dp[0] = 0;
        int atk[] = new int[n];
        int mp[] = new int[n];
        for(int i = 0; i < n; i++){
            atk[i] = sc.nextInt();
            mp[i]= sc.nextInt();
        }
        sc.close();
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < n; j++) {
                for(int k = 0; k <= atk[j]; k++){
                    int ind = Math.min(i+k,h); //体力最大値を超えない
                    dp[ind] = Math.min(dp[ind], dp[ind-k] + mp[j]);
                    if(i+k > h){
                        break;
                    }
                }
            }
        }
        System.out.println(dp[h]);
    }
}
 