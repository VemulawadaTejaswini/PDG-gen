import java.util.*;
public class knapsack2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numItems = kb.nextInt();
		int maxWeight = kb.nextInt();

		//i is weight, dp[i] is value at weight i
		long[] dp = new long[(int)1e5+1];
		//fill with -1 so we know that we dont know anything there
		Arrays.fill(dp, -1);
		//base case, have nothing
		dp[0] = 0;
		
		//consider items
		//build up the array
		for(int i = 0; i < numItems; i++) {
			long weight = kb.nextInt();
			int value = kb.nextInt();
			for(int j = dp.length-1; j >= 0; j--) {
			//	System.out.println("i:"+i+" j:"+j);
				//-1 means no way to get to state, so we cant build off this
				if(dp[j] == -1) {
					continue;
				}
				//if inbounds
				if(dp[value]+dp[j] <= dp.length-1) {
					// System.out.println("this "+(dp[value]+dp[j]));
					if(dp[value+j]==-1)
						dp[value+j] = dp[j] + weight;
					else{
						dp[value+j] = Math.min(dp[value+j], dp[j]+weight);
						// System.out.println("dp[val+j] "+dp[(value+j)]+" i:"+i+" j:"+j);
					}
				}
			}
		}
		
		long max = 0;
		for(int i = 0; i < dp.length; i++) {
			if(dp[i] != -1 && dp[i] <= maxWeight){
                max = i;
            }
		}
		System.out.println(max);
	}

}