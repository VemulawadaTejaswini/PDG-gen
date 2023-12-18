import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long[] map = new long[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextLong();
		}
		
		long ans1 = calcAns(map, 1);
		long ans2 = calcAns(map, -1);

		
		System.out.println(Math.min(ans1, ans2));
	}
	
	static long calcAns(long[] map, int type) {
		long ans = 0;
		long sum = 0;
		for (int i = 0; i < map.length; i++) {
			long a = map[i];
			sum += a;
			if (type == -1) {
				if (sum <= type) {
					type = 1;
					continue;
				} else {
					ans += sum + 1;
					type = 1;
					sum = -1;
				}
			} else {
				if (sum >= type) {
					type = -1;
					continue;
				} else {
					ans += Math.abs(sum) + 1;
					type = -1;
					sum = 1;
				}
			}
		}
		
		
		return ans;
	}
}
