import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int a = sc.nextInt();
		int[] x = new int[n];
		int[] h = new int[n];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			h[i] = sc.nextInt();
			map.put(x[i], h[i]);
		}
		sc.close();

		Arrays.sort(x);
		h = IntStream.range(0, n).map(i -> map.get(x[i])).toArray();
		int index1 = 0;
		long count = 0L;
		while (index1 < n) {
			int c = (int) Math.ceil((double) h[index1] / a);
			count += c;
			int index2 = index1 + 1;
			while (index2 < n && x[index2] <= x[index1] + d * 2 && h[index2] <= c * a) {
				index2++;
			}
			if (index2 < n && x[index2] <= x[index1] + d * 2) {
				h[index2] -= c * a;
			}
			index1 = index2;
		}
		System.out.println(count);
	}
}
