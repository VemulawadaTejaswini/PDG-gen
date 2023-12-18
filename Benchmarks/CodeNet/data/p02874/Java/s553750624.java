import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Obj> listL = new ArrayList<>(n);
		List<Obj> listR = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.i = i;
			o.l = Integer.parseInt(sa[0]);
			o.r = Integer.parseInt(sa[1]);
			o.v = o.r - o.l + 1;
			listL.add(o);
			listR.add(o);
		}
		br.close();

		int ans1 = 0;
		Obj obj1 = new Obj();
		for (int i = 0; i < n; i++) {
			Obj o = listL.get(i);
			if (o.v > ans1) {
				ans1 = o.v;
				obj1 = o;
			}
		}
		obj1.t = 1;
		int l1 = obj1.l;
		int r1 = obj1.r;

		Collections.sort(listL, (o1, o2) -> o2.l - o1.l);
		Collections.sort(listR, (o1, o2) -> o1.r - o2.r);

		for (int i = 0; i < listL.size() - 1; i++) {
			Obj oc = listL.get(i);
			if (oc.t != 0) {
				continue;
			}
			Obj on = null;
			for (int j = i + 1; j < listL.size(); j++) {
				on = listL.get(j);
				if (on.t == 1) {
					on = null;
				} else {
					break;
				}
			}
			if (on == null) {
				break;
			}

			int dl2 = oc.l - on.l;
			int dr2 = 0;
			for (int j = 0; j < listR.size(); j++) {
				Obj oj = listR.get(j);
				if (oj.t == 0) {
					dr2 = oj.r;
					break;
				}
			}
			dr2 = Math.max(dr2 - oc.r, 0);

			int dl1 = Math.max(oc.l - l1, 0);
			int dr1 = Math.max(r1 - oc.r, 0);
			if (Math.min(dl1 + dr1, ans1) <= dl2 + dr2) {
				oc.t = 1;
				l1 = Math.max(l1, oc.l);
				r1 = Math.min(r1, oc.r);
				ans1 = Math.max(r1 - l1 + 1, 0);
			} else {
				break;
			}
		}

		for (int i = 0; i < listR.size() - 1; i++) {
			Obj oc = listR.get(i);
			if (oc.t != 0) {
				continue;
			}
			Obj on = null;
			for (int j = i + 1; j < listR.size(); j++) {
				on = listR.get(j);
				if (on.t == 1) {
					on = null;
				} else {
					break;
				}
			}
			if (on == null) {
				break;
			}

			int dr2 = on.r - oc.r;
			int dl2 = 1000000000;
			for (int j = 0; j < listL.size(); j++) {
				Obj oj = listL.get(j);
				if (oj.t == 0) {
					dl2 = oj.l;
					break;
				}
			}
			dl2 = Math.max(oc.l - dl2, 0);

			int dl1 = Math.max(oc.l - l1, 0);
			int dr1 = Math.max(r1 - oc.r, 0);
			if (Math.min(dl1 + dr1, ans1) <= dr2 + dl2) {
				oc.t = 1;
				l1 = Math.max(l1, oc.l);
				r1 = Math.min(r1, oc.r);
				ans1 = Math.max(r1 - l1 + 1, 0);
			} else {
				break;
			}
		}

		int l2 = 1;
		int r2 = 1000000000;
		for (int i = 0; i < listL.size(); i++) {
			Obj o = listL.get(i);
			if (o.t == 0) {
				l2 = Math.max(l2, o.l);
				r2 = Math.min(r2, o.r);
			}
		}
		int ans2 = r2 - l2 + 1;

		System.out.println(ans1 + ans2);
	}

	static class Obj {
		int i, l, r, v, t;
	}
}
