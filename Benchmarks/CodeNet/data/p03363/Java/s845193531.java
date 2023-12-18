import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextLong();
		int ans = 0;
		long[] sum = new long[n + 1];
		sum[0] = 0;
		for(int i = 0 ; i < n ; i++) {
			sum[i + 1] = sum[i] + a[i];
		}
		Map<Long, Long> map = new HashMap<>();
		for(int i = 0 ; i < n + 1 ; i++) {
			if(map.containsKey(sum[i])) {
				map.put(sum[i], map.get(sum[i]) + 1);
			} else {
				map.put(sum[i], 1L);
			}
		}
		for(long key : map.keySet()) {
			if(map.get(key) >= 2) ans += map.get(key) * (map.get(key) - 1) / 2;
		}
		System.out.println(ans);
 	}
}
