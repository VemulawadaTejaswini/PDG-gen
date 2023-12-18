import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Integer, List<Obj>> map = new HashMap<Integer, List<Obj>>();
		for (int i = 0; i < m; i++) {
			Obj o = new Obj();
			o.l = sc.nextInt();
			o.r = sc.nextInt();
			o.d = sc.nextInt();

			List<Obj> listL = map.get(o.l);
			if (listL == null) {
				listL = new ArrayList<Obj>();
				map.put(o.l, listL);
			}
			listL.add(o);

			List<Obj> listR = map.get(o.r);
			if (listR == null) {
				listR = new ArrayList<Obj>();
				map.put(o.r, listR);
			}
			listR.add(o);
		}
		sc.close();

		int[] x = new int[n + 1];
		boolean[] f = new boolean[n + 1];

		for (Integer l : map.keySet()) {
			if (f[l]) {
				continue;
			}
			Queue<Integer> que = new ArrayDeque<Integer>();
			que.add(l);
			f[l] = true;
			while (!que.isEmpty()) {
				Integer cur = que.poll();
				List<Obj> list = map.get(cur);
				for (Obj o : list) {
					if (f[o.l]) {
						if (f[o.r]) {
							if (x[o.r] != x[o.l] + o.d) {
								System.out.println("No");
								return;
							}
						} else {
							x[o.r] = x[o.l] + o.d;
							que.add(o.r);
							f[o.r] = true;
						}
					} else {
						if (f[o.r]) {
							x[o.l] = x[o.r] - o.d;
							que.add(o.l);
							f[o.l] = true;
						} else {
							throw new Exception();
						}
					}
				}
			}
		}
		System.out.println("Yes");
	}

	static class Obj {
		int l, r, d;
	}
}
