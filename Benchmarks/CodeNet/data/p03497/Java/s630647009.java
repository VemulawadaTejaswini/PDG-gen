import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}
		Integer[] arr = map.values().toArray(new Integer[0]);
		Arrays.sort(arr);
		int ans = 0;
		for (int i = 0; i < arr.length - k; i++) {
			ans += arr[i];
		}
		System.out.println(ans);
	}
}
