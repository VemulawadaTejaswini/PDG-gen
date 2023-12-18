import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.solve();
	}

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int N = sc.nextInt();
		Pt[] p = new Pt[N + 1];
		ArrayList<Pt>[] ra = new ArrayList[R + 1];
		ArrayList<Pt>[] ca = new ArrayList[C + 1];
		String ans = "Yes";

		for (int i = 1; i <= N; i++) {
			p[i] = new Pt();
			p[i].r = sc.nextInt();
			p[i].c = sc.nextInt();
			p[i].a = sc.nextInt();
			p[i].i = i;
			if (ra[p[i].r] == null) {
				ra[p[i].r] = new ArrayList<Pt>();
			}
			ra[p[i].r].add(p[i]);
			if (ca[p[i].c] == null) {
				ca[p[i].c] = new ArrayList<Pt>();
			}
			ca[p[i].c].add(p[i]);
		}

		boolean[] chk = new boolean[N + 1];
		int[] r_min = new int[N + 1];
		int[] c_min = new int[N + 1];
		int[] r_d = new int[R + 1];
		int[] c_d = new int[C + 1];
		int[] r_grp = new int[R + 1];
		int[] c_grp = new int[C + 1];
		Arrays.fill(r_d, Integer.MIN_VALUE);
		Arrays.fill(c_d, Integer.MIN_VALUE);

		Queue<Pt> r_que = new ArrayDeque<>();
		Queue<Pt> c_que = new ArrayDeque<>();
		i_LOOP: for (int i = 1; i <= N; i++) {
			if (chk[i]) {
				continue;
			}

			r_que.clear();
			c_que.clear();
			r_que.add(p[i]);
			c_que.add(p[i]);
			r_grp[p[i].r] = i;
			c_grp[p[i].c] = i;
			r_d[p[i].r] = 0;
			c_d[p[i].c] = 0;
			chk[i] = true;
			int r_m = Integer.MAX_VALUE;
			int c_m = Integer.MAX_VALUE;
			while (r_que.size() > 0 || c_que.size() > 0) {
				if (r_que.size() > 0) {
					Pt cur = r_que.poll();
					if (ra[cur.r] != null) {
						for (Pt t : ra[cur.r]) {
							if (t == cur) {
								continue;
							}
							int d = t.a - cur.a;
							if (c_d[t.c] != Integer.MIN_VALUE
									&& c_d[t.c] != d) {
								ans = "No";
								break i_LOOP;
							} else {
								c_d[t.c] = d;
								c_m = Math.min(c_m, d);
							}
							chk[t.i] = true;
							if (c_grp[t.c] == 0) {
								c_grp[t.c] = i;
								c_que.add(t);
							}
						}
					}
				} else if (c_que.size() > 0) {
					Pt cur = c_que.poll();
					if (ca[cur.c] != null) {
						for (Pt t : ca[cur.c]) {
							if (t == cur) {
								continue;
							}
							int d = t.a - cur.a;
							if (r_d[t.r] != Integer.MIN_VALUE
									&& r_d[t.r] != d) {
								ans = "No";
								break i_LOOP;
							} else {
								r_d[t.r] = d;
								r_m = Math.min(r_m, d);
							}
							chk[t.i] = true;
							if (r_grp[t.r] == 0) {
								r_grp[t.r] = i;
								r_que.add(t);
							}
						}
					}
				}
			}
			r_min[i] = r_m;
			c_min[i] = c_m;
		}
		for (int i = 1; i <= N; i++) {
			int rg = r_grp[p[i].r];
			int cg = c_grp[p[i].c];
			if (p[i].a + r_min[rg] - r_d[p[i].r] + c_min[cg]
					- c_d[p[i].c] < 0) {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);
	}

	class Pt {
		int r = 0;
		int c = 0;
		int a = 0;
		int i = 0;
	}
}
