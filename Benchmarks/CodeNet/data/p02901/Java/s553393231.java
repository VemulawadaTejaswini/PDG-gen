import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    int[] s;
    long mod = 1000000000+7;
    String str;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        // binary search
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[m];
        int[] keys = new int[m];
        for(int j=0;j<m;j++){
            a[j] = sc.nextInt();
            int b = sc.nextInt(), c;
            for(int i=0;i<b;i++){
                c = sc.nextInt()-1;
                keys[j] |= (1<<c);
            }
        }
        int[] dp = new int[(1<<n)];
        int maxi = Integer.MAX_VALUE;
        Arrays.fill(dp,maxi);
        dp[0] = 0;
        for(int s=0;s<(1<<n);s++){
            if(dp[s]==maxi) continue; // can't be reached from previous records
            for(int i=0;i<m;i++){
                int curKey = keys[i], cost = a[i];
                int target = s | curKey;
                dp[target] = Math.min(dp[target], dp[s]+cost);
            }
        }
        return dp[(1<<n)-1] == maxi?-1:dp[(1<<n)-1];
    }
}

