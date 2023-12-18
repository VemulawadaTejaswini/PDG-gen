import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] indexes = new int[n + 1];
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			indexes[arr[i]] = i;
			set.add(i);
		}
		set.add(n);
		set.add(-1);
		long ans = 0;
		for (int i = n; i >= 1; i--) {
			int idx = indexes[i];
			long left = set.lower(idx) + 1;
			long right = set.higher(idx) - 1;
			ans += (idx - left + 1) * (right - idx + 1) * i;
			set.remove(idx);
		}
		System.out.println(ans);
	}
}
