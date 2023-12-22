import java.util.*;
public class Main {
	int[][] dp = new int[10][10];
	
	void small(int x, int y) {
		dp[x][y]++;
		if(x + 1 < 10) {
			dp[x + 1][y]++;
			
		}
		if(y + 1 < 10) {
			dp[x][y + 1]++;
			
		}
		if(x - 1 >= 0) {
			dp[x - 1][y]++;
			
		}
		if(y - 1 >= 0) {
			dp[x][y - 1]++;
			
		}
	}
	
	void medium(int x, int y) {
		small(x, y);
		if(x + 1 < 10 && y + 1 < 10) {
			dp[x + 1][y + 1]++;
			
		}
		if(x - 1 >= 0 && y + 1 < 10) {
			dp[x - 1][y + 1]++;
			
		}
		if(x + 1 < 10 && y - 1 >= 0) {
			dp[x + 1][y - 1]++;
			
		}
		if(x - 1 >= 0 && y - 1 >= 0) {
			dp[x - 1][y - 1]++;
			
		}
	}
	
	void large(int x, int y) {
		medium(x, y);
		if(x + 2 < 10) {
			dp[x + 2][y]++;
			
		}
		if(y + 2 < 10) {
			dp[x][y + 2]++;
			
		}
		if(x - 2 >= 0) {
			dp[x - 2][y]++;
			
		}
		if(y - 2 >= 0) {
			dp[x][y - 2]++;
			
		}
	}
	
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int count = 0;
		while(stdIn.hasNext()) {
			String input = stdIn.next();
			int x = input.charAt(0) - '0';
			int y = input.charAt(2) - '0';
			int mode = input.charAt(4) - '0';
			switch(mode) {
			case 1: small(x, y); break;
			case 2: medium(x, y); break;
			case 3: large(x, y); break;
			}
		}
		for(int r = 0; r < 10; r++) {
			for(int c = 0; c < 10; c++) {
				if(dp[r][c] != 0) {
					max = Math.max(max, dp[r][c]);
					continue;
				}
				count++;
			}
		}
		System.out.println(count + "\n" + max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}