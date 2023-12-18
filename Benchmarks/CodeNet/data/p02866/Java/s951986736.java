import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] D = new int[N];
		int[] distance = new int[N];

		int maxD = 0;
		Arrays.fill(distance, 0);
		for (int i = 0; i < N; i++){
			int d = sc.nextInt();
			D[i] = d;
			distance[d]++;
			if (d > maxD)
				maxD = d;
		}
		long ans = solve(D, distance, maxD);
		System.out.println(ans);
	}
	
	static long solve(int[] D, int[] distance, int maxD) {

		if (D[0] != 0) 
			return 0;

		if (distance[0] != 1)
			return 0;

		if (distance[1] == D.length-1) 
			return 1;

		long ans = 1L;

		boolean flag = false;
		for (int i = 2; i <= maxD; i++) {

			if (flag && distance[i] == 0){
				return 0;
			}
			
			if (distance[i] != 0) {
				if (distance[i] == 1) {
					ans *= distance[i-1];
				} else {
					if (i == 2) {
						ans = distance[1];
					}
					ans = (long)Math.pow(ans, distance[i]);
				}
			} else {
				flag = true;
			} 
		}
		ans %= 998244353;
		return ans;
	}
}