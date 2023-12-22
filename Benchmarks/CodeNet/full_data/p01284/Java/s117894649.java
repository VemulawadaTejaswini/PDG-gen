import java.util.*;

public class Main {
	static int[] cycle, dm;
	static int enday;
	static int[][][] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			cycle = new int[n];
			for(int i=0;i<n;i++) cycle[i] = sc.nextInt();

			int m = sc.nextInt();
			dm = new int[104];
			enday = Integer.MIN_VALUE;
			for(int i=0;i<m;i++) {
				int D = sc.nextInt(), M = sc.nextInt();
				if(dm[D-1] != 0) dm[D-1] = Math.min(dm[D-1], M);
				else dm[D-1] = M;
				enday = Math.max(enday, D);
			}

			memo = new int[enday][cycle.length][100];
			for(int i=0;i<enday;i++){
				for(int j=0;j<cycle.length;j++){
					Arrays.fill(memo[i][j], Integer.MAX_VALUE);
				}
			}

			System.out.println(solve(0,0,0));
		}
	}

	private static int solve(int day,int ci,int count){
		if(day == enday) return count;
		if(memo[day][ci][count] != Integer.MAX_VALUE) return memo[day][ci][count];

		int res = Integer.MAX_VALUE;

		if(dm[day] == 0 || cycle[ci] <= dm[day])
			res = Math.min(res, solve(day+1,(ci+1)%cycle.length,count));

		res = Math.min(res, solve(day+1,1%cycle.length,count+1));
		
		return memo[day][ci][count] = res;
	}
}