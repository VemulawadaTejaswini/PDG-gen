import java.util.*;

public class Main {
	static long[] arr;
	static ArrayList<Long> list = new ArrayList<>();
	static int n;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int k = sc.nextInt();
		arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		add(0, 0);
		Collections.sort(list);
		long ans = list.get(list.size() - 1);
		for (int i = 1; i < k; i++) {
			long x = list.get(list.size() - i - 1);
			ans = ans & x;
		}
		System.out.println(ans);
	}
	
	static void add(int idx, long total) {
		if (idx == n) {
			list.add(total);
		} else {
			add(idx + 1, total);
			add(idx + 1, total + arr[idx]);
		}
	}
}