import java.util.Scanner;

public class frog1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] height = new int[n];
		for(int i=0; i<n; i++) {
			height[i] = sc.nextInt();
		}
		int[] cost = new int[n];
		cost[0] = 0;
		for(int i=1; i<n; i++) {
			cost[i] = cost[i-1]+Math.abs(height[i]-height[i-1]);
			if(i-2>=0) {
				cost[i] = Math.min(cost[i-2]+Math.abs(height[i]-height[i-2]), cost[i]);
			}
		}
		System.out.println(cost[n-1]);
	}

}
