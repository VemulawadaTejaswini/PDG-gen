import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] stepInfo = new int[n];
		for(int i =0;i < n; i++) {
			stepInfo[i] = sc.nextInt();
		}
		int[] minimumCostInfo = new int[n];
		minimumCostInfo[1] = Math.abs(stepInfo[1]-stepInfo[0]);

		for(int i =2; i < n;i++) {
			int minimumCost = Integer.MAX_VALUE;
			int stepCount = k;
			if(stepCount > i) {
				stepCount = i;
			}
			for(int j =1; j <= stepCount; j++ ) {
				int cost = minimumCostInfo[i-j] + Math.abs(stepInfo[i]-stepInfo[i-j]);
				if(cost < minimumCost) {
					minimumCost = cost;
				}
			}
			minimumCostInfo[i] = minimumCost;
		}

		System.out.println(minimumCostInfo[n-1]);

	}
}