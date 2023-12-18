import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		Map<Integer, Long> map = new TreeMap<>();
		for(int i = 0 ; i < n ; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + b[i]);
			} else {
				map.put(a[i], (long)b[i]);
			}
		}
		for(int key : map.keySet()) {
			k -= map.get(key);
			if(k <= 0) {
				System.out.println(key);
				return;
			}
		}
	}
}
