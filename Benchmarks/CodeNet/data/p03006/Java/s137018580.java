import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long c[][] = new long[N][2];
		long d[][] = new long[N][2];

		for (int i = 0; i < N; i++) {
			c[i][0] = sc.nextLong();
			c[i][1] = sc.nextLong();
		}
		Arrays.sort(c, (a,b) -> Long.compare(b[1], a[1]));
		Arrays.sort(c, (a,b) -> Long.compare(b[0], a[0]));

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < d.length-1; i++) {
			d[i][0] = c[i][0] - c[i+1][0];
			d[i][1] = c[i][1] - c[i+1][1];
			String s = Long.toString(d[i][0]) +" "+ Long.toString(d[i][1]);
			if (map.containsKey(s)) {
				map.put(s,map.get(s)+1);
			} else {
				map.put(s, 1);
			}
		}
		int max = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			max = Integer.max(max, entry.getValue());
		}
		System.out.println(N-max);
	}
}
