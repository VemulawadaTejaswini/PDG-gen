import java.util.*;

public class Main {
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		long total = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		if (total < k) {
			System.out.println(n);
			return;
		}
		Arrays.sort(arr);
		TreeSet<Integer>[] sets = new TreeSet[n];
		TreeSet<Integer>[] rsets = new TreeSet[n];
		sets[0] = new TreeSet<Integer>();
		sets[0].add(0);
		rsets[0] = new TreeSet<Integer>();
		rsets[0].add(0);
		for (int i = 0; i < n - 1; i++) {
			sets[i + 1] = new TreeSet<Integer>(sets[i]);
			rsets[i + 1] = new TreeSet<Integer>(rsets[i]);
			for (int x : sets[i]) {
				if (x + arr[i] < k) {
					sets[i + 1].add(arr[i] + x);
				}
			}
			for (int x : rsets[i]) {
				if (x + arr[n - i - 1] < k) {
					rsets[i + 1].add(arr[n - i - 1] + x);
				}
			}
		}
		int prev = Integer.MAX_VALUE;
		for (int i = n - 1; i >= 0; i--) {
			if (prev == arr[i]) {
				continue;
			}
			prev = arr[i];
			boolean flag = false;
			for (int x : sets[i]) {
				int y = rsets[n - i - 1].lower(k - x);
				if (x + y >= k - arr[i]) {
					flag = true;
					break;
				}
			}
			if (flag) {
				continue;
			}
			System.out.println(i + 1);
			return;
		}
		System.out.println(0);
	}
}
