
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		
		int h = Integer.parseInt(tmpArray[0]);
		int n = Integer.parseInt(tmpArray[1]);

		int damage[] = new int[n];
		int cost[] = new int[n];
		
		int dp[] = new int[10000 + 1];
		
		for(int i = 0; i < n; i++) {
			tmpArray = br.readLine().split(" ");
			
			damage[i] = Integer.parseInt(tmpArray[0]);
			cost[i] = Integer.parseInt(tmpArray[1]);
		}
		
//		int minCost[] = new int[10000 + 1];
//		Arrays.fill(minCost, Integer.MAX_VALUE);
//		minCost[0] = 0;
		/*
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= 10000 ; j++) {
				int tmpCost = (j + damage[i] - 1)/damage[i]*cost[i];
				if(tmpCost < minCost[j]) {
					minCost[j] = tmpCost;
				}
			}
		}*/
		
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for(int i = 1; i <= 10000; i++) {
			for(int j = 0; j < n; j++) {
				dp[i] = Math.min(dp[i], dp[i - Math.min(i, damage[j])] + cost[j]);
			}
		}
		
		//debug 
//		for(int i = 0; i < 20; i++) {
//			System.out.print(dp[i]+" ");
//		}
//		System.out.println();
		
		System.out.println(dp[h]);
	}

}
