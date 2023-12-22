import java.util.*;
public class Main { 
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static ArrayList<Integer> oddList = new ArrayList<Integer>();
	static short[][] dp;
	static short[][] odp;
	static int n;
	static short INF = 1024;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		makeList();
		n = 1000000;
		dp = new short[1000001][list.size()+1];
		for(int i = 1; i <= 1000000; i++) {
			Arrays.fill(dp[i], INF);
		}
		dp[0][0] = 0;
		dp();
		
		odp = new short[1000001][oddList.size()+1];
		System.gc();
		for(int i = 1; i <= 1000000; i++) {
			Arrays.fill(odp[i], INF);
		}
		odp[0][0] = 0;
		oddDp();
		System.gc();
		while(true) {
			n = stdIn.nextInt();
			if(n == 0) break;
			int ansA = 0;
			int ansB = 0;
			
			ansA = dp[n][list.size()];
			ansB = dp[n][oddList.size()];
			System.out.println(ansA + " " + ansB);
		}
	}
	public static void dp() {
		for(int i = 0; i <= n; i++) {
			for(int j = 1; j <= list.size(); j++) {
				if(i - list.get(j-1) >= 0) {
					if(dp[i-list.get(j-1)][j] + 1 < dp[i][j-1]) {
						dp[i][j] = (short) (dp[i-list.get(j-1)][j] + 1);
					}
					else {
						dp[i][j] = dp[i][j-1];
					}
				}
				else {
					dp[i][j] = dp[i][j-1];
				}
			}
			if(i % 100000 == 0)
				System.gc();
		}
	}
	public static void oddDp() {
		for(int i = 0; i <= n; i++) {
			for(int j = 1; j <= oddList.size(); j++) {
				if(i - oddList.get(j-1) >= 0) {
					if(dp[i-oddList.get(j-1)][j] + 1 < dp[i][j-1]) {
						dp[i][j] = (short) (dp[i-oddList.get(j-1)][j] + 1);
					}
					else {
						dp[i][j] = dp[i][j-1];
					}
				}
				else {
					dp[i][j] = dp[i][j-1];
				}
			}
		}
		
	}
	public static void makeList() {
		for(int i = 1; i < 200000; i++) {
			int a = i * (i + 1) * (i + 2);
			if(a % 6 == 0) {
				if(a / 6 > 1000000) break;
				list.add(a / 6);
				if((a / 6) % 2 == 1) {
					oddList.add(a/6);
				}
			}
		}
	}
	
}