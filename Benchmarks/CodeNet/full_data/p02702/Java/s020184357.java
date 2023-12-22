import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { //Use MODULUS array
		Scanner input = new Scanner(System.in);
		/*for (int i = 1; 1 <= 100; i++) {
			System.out.println(i*2019);
		}*/
		long x = 0;
		String X = input.next();
		int N = X.length();
		int MOD = 2019;
		int[] dp = new int[N];
		int START = 0;
		long cnt = 0;
		while (START < N-2) {
			dp[START] = Integer.parseInt(X.substring(START,START+1));
			for (int i = START+1; i < N; i++) {
				dp[i] = dp[i-1]*10+Integer.parseInt(X.substring(i,i+1));
				dp[i]%=MOD;
				if (dp[i]==0) cnt++;
			}
			START++;
		}
		/*for (int i = 0; i < N; i++) {
			System.out.println(dp[i]);
		}*/
		System.out.println(cnt);
	}
}