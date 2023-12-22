import java.util.Scanner;
import static java.lang.Math.*;
import java.io.PrintWriter;
class Main{
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		while(sc.hasNext()){
			int n = sc.nextInt(), 
				m = sc.nextInt();
			int[] money = new int[m];
			int[] dp = new int[n + 1];
			for(int i= 0; i < m; i++){
				money[i] = sc.nextInt();
			}
			for(int i = 0; i < n + 1; i++){
				dp[i] = 100000;
			}
			dp[0] = 0;
			for(int i = 0; i < m; i++){
				for(int j = money[i]; j < n + 1; j++){
					dp[j] = Math.min(dp[j], dp[j - money[i]]+1);
				}
			}
			System.out.println(dp[n]);
		}

	}
}