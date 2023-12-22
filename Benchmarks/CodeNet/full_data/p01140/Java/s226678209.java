import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0)
				break;
			int[] h = new int[n];
			int[] w = new int[m];
			Map<Integer, Integer> set = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
				int nh = 0;
				for (int j = i; j >= 0; j--) {
					nh += h[j];
					if (set.containsKey(nh))
						set.put(nh, set.get(nh) + 1);
					else
						set.put(nh, 1);
				}
			}
			int result = 0;
			for (int i = 0; i < m; i++) {
				w[i] = sc.nextInt();
				int nw = 0;
				for (int j = i; j >= 0; j--) {
					nw += w[j];
					if (set.containsKey(nw))
						result += set.get(nw);
				}
			}
			System.out.println(result);
		}
		sc.close();
	}
}