import java.util.*;
import java.math.*;

public class Main {

    static long MOD = 1000000007;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        HashMap<Long,Boolean> map = new HashMap<>();
        ArrayList<Long> list = new ArrayList<>();
        for(int i = 1; i * i <= n; i++) {
            if(!map.containsKey(i)) {
                map.put((long)i,true);
                list.add((long)i);
            }
            if(!map.containsKey(n / i)) {
                map.put((long)(n/i),true);
                list.add(n/i);
            }
        }
        Collections.sort(list);
        int m = list.size();

        long[][] dp = new long[(int)k+1][m];
        for(int i = 0; i < m; i++) {
            dp[0][i] = 1;
        }

        for (int j = 0;j < (int)k;j++) {
			dp[j+1][m-1]=dp[j][0];
			for (int i = m - 2; i >= 0; i--) {
				dp[j+1][i]= (dp[j+1][i+1] + (list.get(m - i - 1) - list.get(m - i - 2)) * dp[j][m - i - 1]) % MOD;
			}
		}

        System.out.println(dp[(int)k][0]);

    }
}