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
			Map<Integer, Integer> height = new HashMap<Integer, Integer>();
			int[] w = new int[m];
			Map<Integer, Integer> width = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
				int hh = h[i];
				if (height.containsKey(hh))
					height.put(i, height.get(i) + 1);
				else
					height.put(hh, 1);
				for (int j = i - 1; j >= 0; j--) {
					hh += h[j];
					if (height.containsKey(hh))
						height.put(hh, (int) height.get(hh) + 1);
					else
						height.put(hh, 1);
				}
			}
			for (int i = 0; i < m; i++) {
				w[i] = sc.nextInt();
				int ww = w[i];
				if (width.containsKey(ww))
					width.put(ww, (int) width.get(ww) + 1);
				else
					width.put(ww, 1);
				for (int j = i - 1; j >= 0; j--) {
					ww += w[j];
					if (width.containsKey(ww))
						width.put(ww, (int) width.get(ww) + 1);
					else
						width.put(ww, 1);
				}
			}
			int result = 0;
			for (int i = 0; i < 1500001; i++)
				if (height.containsKey(i) && width.containsKey(i))
					result += (int) height.get(i) * (int) width.get(i);
			System.out.println(result);
		}
		sc.close();
	}
}