import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();

			Map<Integer, Integer[]> cakes = new HashMap<Integer, Integer[]>();
			int fw = sc.nextInt();
			int fd = sc.nextInt();
			if (n == 0 && fw == 0) {
				sc.close();
				break;
			}
			Integer[] first = { fw, fd };
			cakes.put(1, first);
			for (int i = 0; i < n; i++) {
				int p = sc.nextInt();
				int s = sc.nextInt();

				int w = cakes.get(p)[0];
				int d = cakes.get(p)[1];

				// 識別番号を付け直す
				for (int id = p + 1; id <= i + 1; id++) {
					// i回目のカット前には識別番号i+1までケーキがある
					// 1個ずつ下にずれる
					cakes.get(id - 1)[0] = cakes.get(id)[0];
					cakes.get(id - 1)[1] = cakes.get(id)[1];
				}

				s %= (w + d);

				int wa = w, da = d;
				int wb = w, db = d;
				if (s < w) {
					wa = s;
					wb = w - wa;
				} else {
					da = s - w;
					db = d - da;
				}

				cakes.get(i + 1)[0] = Math.min(wa, wb);
				cakes.get(i + 1)[1] = Math.min(da, db);

				// i回目のカットでは識別番号i+2のケーキが生まれる
				Integer[] newcake = { Math.max(wa, wb), Math.max(da, db) };
				cakes.put(i + 2, newcake);
			}

			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 1; i <= n + 1; i++) {
				int w = cakes.get(i)[0];
				int d = cakes.get(i)[1];
				list.add(w * d);
			}

			Collections.sort(list);
			for (Integer size : list) {
				System.out.print(size + " ");
			}
			System.out.println();

		}
	}
}