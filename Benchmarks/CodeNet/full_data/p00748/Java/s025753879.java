import java.util.*;
public class Main { 
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static ArrayList<Integer> oddList = new ArrayList<Integer>();
	static int[] dp;
	static int[] odp;
	static int n;
	static int INF = 1 << 22;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		makeList();		
		dp = new int[1000001];
		odp = new int[1000001];
		Arrays.fill(dp, INF);
		Arrays.fill(odp, INF);
		dp[0] = odp[0] = 0;
		dp();
		oddDp();
		while(true) {
			n = stdIn.nextInt();
			if(n == 0) break;
			int ansA = 0;
			int ansB = 0;
			
			ansA = dp[n];
			ansB = odp[n];
			System.out.println(ansA + " " + ansB);
		}
	}
	public static void dp() {
		for(int i = 0; i <= 1000000; i++) {
			for(int j = 0; j < list.size(); j++) {
				int a = list.get(j);
				if(i - a < 0) break;
				if(dp[i - a] + 1 < dp[i]) {
					dp[i] = dp[i-a] + 1;
				}
			}
		}
	}
	public static void oddDp() {
		for(int i = 0; i <= 1000000; i++) {
			for(int j = 0; j < oddList.size(); j++) {
				int a = oddList.get(j);
				if(i - a < 0) break;
				if(odp[i - a]+1 < odp[i]) {
					odp[i] = odp[i-a]+1;
				}
			}
		}
		
	}
	public static void makeList() {
		for(int i = 1; i < 182; i++) {
			int a = i * (i + 1) * (i + 2);
			if(a % 6 == 0) {
				a /= 6;
				list.add(a);
				if(a % 2 == 1) {
					oddList.add(a);
				}
			}
		}
	}
	
}