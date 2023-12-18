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
			if(!map.containsKey(a[i])) {
				map.put(a[i], 1);
			} else {
				map.put(a[i], map.get(a[i]) + 1);
			}
		}
		long ans = 0;
		for(int key : map.keySet()) {
			if(map.get(key) > key) {
				ans += Math.min(map.get(key) - key, map.get(key));
			} else if(map.get(key) < key) {
				ans += Math.min(key - map.get(key), map.get(key));
			}
		}
		System.out.println(ans);
	}
}
