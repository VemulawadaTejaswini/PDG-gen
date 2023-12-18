import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[m];
		int[] key = new int[m];
		for(int i = 0; i < m; i++){
		    p[i] = sc.nextInt();
		    int b = sc.nextInt();
		    for(int j = 0; j < b; j++){
		        key[i] |= 1<<(sc.nextInt() - 1);
		    }
		}
		// 計算
		int result = -1;
		int[] dp = new int[1<<n];
		int INF = 1001001001;
		Arrays.fill(dp, INF);
		dp[0] = 0;
		for(int i = 0; i < 1<<n; i++){
		    for(int j = 0; j < m; j++){
		        dp[i | key[j]] = min(dp[i | key[j]],  dp[i] + p[j]);
		    }
		}
		if(dp[(1<<n) - 1] != INF){
		    result = dp[(1<<n) - 1];
		}

		// 出力
		System.out.println(result);
        
	}
}