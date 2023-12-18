import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		Map<Integer, Obj> map = new HashMap<Integer, Obj>();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int k = sc.nextInt();
				Obj o = new Obj();
				o.x = i;
				o.y = j;
				map.put(k, o);
			}
		}
		int n = h * w;
		int[] sum = new int[n + 1];
		for (int i = d + 1; i < n + 1; i++) {
			sum[i] = sum[i - d] + calc(map.get(i), map.get(i - d));
		}

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(sum[r] - sum[l]);
		}
		sc.close();
	}

	static class Obj {
		int x, y;
	}

	static int calc(Obj o1, Obj o2) {
		return Math.abs(o1.x - o2.x) + Math.abs(o1.y - o2.y);
	}
}
