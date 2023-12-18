import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < n ; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		int ans = 0;
		for(int key : map.keySet()) {
			int cnt = 0;
			for(int i = key - 1 ; i <= key + 1 ; i++) {
				if(map.containsKey(i)) cnt += map.get(i);
			}
			ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}
}