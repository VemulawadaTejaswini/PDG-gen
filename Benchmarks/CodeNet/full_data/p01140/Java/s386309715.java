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
			int[] height = new int[1500000];
			int[] w = new int[m];
			int[] width = new int[1500000];
			int hmax = 0, wmax = 0;
			for (int i = 0; i < n; i++)
				h[i] = sc.nextInt();
			for (int i = 0; i < m; i++)
				w[i] = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int len = 0;
				for (int j = i; j < n; j++) {
					len += h[j];
					height[len]++;
				}
			}
			for (int i = 0; i < m; i++) {
				int len = 0;
				for (int j = i; j < n; j++) {
					len += w[j];
					width[len]++;
				}
			}
			int result = 0;
			for (int i = 0; i <= Math.min(hmax, wmax); i++)
				result += height[i] * width[i];
			System.out.println(result);
		}
		sc.close();
	}

	static void add(Map<Integer, Integer> map, int key) {
		if (map.containsKey(key))
			map.put(key, map.get(key) + 1);
		else
			map.put(key, 1);
	}
}