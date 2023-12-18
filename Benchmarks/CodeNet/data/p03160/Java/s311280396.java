import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] cost = new int[n];
		Arrays.fill(cost, 10000000);
		int[] ary = new int[n];
		for(int i=0; i<n; i++){
			ary[i] = in.nextInt();
		}

		cost[1] = Math.abs(ary[0] - ary[1]);
		cost[2] = Math.min(Math.abs(ary[0] - ary[2]), cost[1] + Math.abs(ary[1] - ary[2]));
		for(int i=3; i<n; i++){
			cost[i] = Math.min(cost[i-1]+ Math.abs(ary[i-1] - ary[i]), 
							   cost[i-2]+ Math.abs(ary[i-2] - ary[i]));
		}
		System.out.println(cost[n-1]);
	}
}
