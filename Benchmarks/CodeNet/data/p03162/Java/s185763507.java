import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int n;
	static int[][] memo, h;
	
	public static int dp(int i, int l) {
		if(i == n)
			return 0;
		if(memo[i][l] != -1)
			return memo[i][l];
		
		int max = 0;
		for(int j = 0; j < 3; j++) {
			if(j == l)
				continue;
			max = Math.max(max, h[i][l] + dp(i + 1, j));
		}
		
		return memo[i][l] = max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		h = new int[n][3];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < 3; j++)
				h[i][j] = sc.nextInt();
		
		memo = new int[n][3];
		for(int i = 0; i < n; i++)
			Arrays.fill(memo[i], -1);
		
		System.out.println(Math.max(dp(0, 0), Math.max(dp(0, 1), dp(0, 2))));
	}
}
