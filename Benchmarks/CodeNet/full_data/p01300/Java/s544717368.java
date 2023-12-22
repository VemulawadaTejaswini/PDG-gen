import java.util.*;
import java.awt.geom.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			char [] c= sc.next().toCharArray();
			if(c.length <= 1 && c[0] == '0'){
				break;
			}
			int [][] dp = new int[2][11];
			if(c[0] != '0'){
				dp[0][c[0] - '0'] = 1;
			}
			int count = 0;
			for(int i = 1; i < c.length; i++){
				
				int prev = (i + 1) % 2;
				int num = c[i] - '0';
				Arrays.fill(dp[i % 2], 0);
				if(i % 2 == 1) num *= -1;
				for(int j = 0; j < 11; j++){
					if(dp[prev][j] == 0) continue;
					int nextJ = (num + j + 11) % 11;
					dp[i % 2][nextJ] += dp[prev][j];
					if(nextJ == 0) count += dp[i % 2][nextJ];
				}
				if(num == 0) continue;
				dp[i % 2][(num + 11) % 11] += 1;
			}
			System.out.println(count);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}