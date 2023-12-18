import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		long result = 0;
		long[][] dp = new long[s.length() + 1][13];
		dp[0][0] = 1;
		for(int i = 1; i <= s.length(); i++){
		    for(int j = 0; j < 10; j++){
		        if(s.charAt(i-1) == '?' || Character.getNumericValue(s.charAt(i-1)) == j){
		            for(int k = 0; k < 13; k++){
		                dp[i][(k*10 + j)%13] = dp[i][(k*10 + j)%13] + dp[i-1][k];
		                dp[i][(k*10 + j)%13] = dp[i][(k*10 + j)%13]%1000000007;
		            }
		        }
		    }
		}
		result = dp[s.length()][5];
		// 出力
		System.out.println(result);
	}
}
