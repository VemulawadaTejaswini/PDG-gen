import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numItems = kb.nextInt();
		int maxWeight = kb.nextInt();

		//i is weight, dp[i] is value at weight i
		long[] dp = new long[maxWeight+1];
		//fill with -1 so we know that we dont know anything there
		Arrays.fill(dp, -1);
		//base case, have nothing
		dp[0] = 0;
		
		//consider items
		//build up the array
		for(int i = 0; i < numItems; i++) {
			int weight = kb.nextInt();
			long value = kb.nextLong();
			for(int j = maxWeight; j >= 0; j--) {
				//-1 means no way to get to state, so we cant build off this
				if(dp[j] == -1) {
					continue;
				}
				//if inbounds
				if(weight+j <= maxWeight) {
					dp[weight+j] = Math.max(dp[weight+j], dp[j]+value);
				}
			}
		}
		
		long max = 0;
		for(int i = 0; i < dp.length; i++) {
			max = Math.max(dp[i], max);
		}
		System.out.println(max);

	}

}