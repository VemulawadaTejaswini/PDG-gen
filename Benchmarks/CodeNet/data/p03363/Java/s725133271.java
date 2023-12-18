import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int[] sum = new int[n + 1];
		for(int i = 0 ; i < n ; i++) sum[i + 1] = sum[i] + a[i];
		Map<Integer, Integer> map = new HashMap<>();
//		System.out.println(Arrays.toString(sum));
		for(int i = 0 ; i < n + 1 ; i++) {
			if(map.containsKey(sum[i])) {
				map.put(sum[i], map.get(sum[i]) + 1);
			} else {
				map.put(sum[i], 1);
			}
		}
//		System.out.println(map);
		int ans = 0;
		for(int key : map.keySet()) {
			int temp = 1;
			int x = map.get(key) - 1;
			if(x >= 2) {
				while(x >= 1) {
					temp *= x;
					x--;
				}
				ans += temp;
			}
		}
		System.out.println(ans);
 	}
}
