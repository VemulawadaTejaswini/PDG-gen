import java.util.HashMap;
import java.util.Scanner;

 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
//		HashSet<Integer> set = new HashSet<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);

		}
		int mx = map.get(arr[0]), mx2 = map.get(arr[1]);
		for (int i = 0; i <n - 2; i += 2) {
			if (arr[i] != arr[i + 2]) {
				int cnt = map.get(arr[i]);
				if (cnt > mx)
					mx = cnt;
			}
		}
		for (int i = 1; i <=n - 3; i += 2) {
			if (arr[i] != arr[i + 2]) {
				int cnt = map.get(arr[i]);
				if (cnt > mx)
					mx2 = cnt;
			}
		}
//		System.out.println(mx+" "+mx2);
		if (map.size() == 1)
			System.out.println(n / 2);
		else
			System.out.println(n - mx - mx2);
	}
}
