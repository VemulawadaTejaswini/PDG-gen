import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] a = new long[n];
		HashMap<Long, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			} else {
				map.put(a[i], 1);
			}
		}
		long[] m = new long[n];
        Arrays.fill(m, 0);
		int j = 0;
		for (long i : map.keySet()) {
			if (map.get(i) >= 4) {
				m[j] = m[j+1] = i;
				j += 2;
			} else if (map.get(i) >= 2) {
				m[j] = i;
				j++;
			}
		}
		Arrays.sort(m);
		System.out.println(m[n-1]*m[n-2]);
	}
}
