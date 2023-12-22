import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		int[][] dp = new int[a.length][b.length];
		int max = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					if(i != 0 && j != 0)
					dp[i][j] = Math.max(dp[i-1][j-1]+1, 1);
					else dp[i][j] = 1;
				}
				max = Math.max(dp[i][j], max);
				
				
			}
		}
		System.out.println(max);
		}
		
	}

	
}