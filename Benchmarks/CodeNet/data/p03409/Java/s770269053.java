import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static class Pair{
		int i, j;
		public Pair(int i, int j) {
			this.i = i;
			this.j = j;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] d = new int[n];
		List<Pair> p = new ArrayList<Pair>();
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Integer.parseInt(sc.next());
		}
		for (int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(sc.next());
			d[i] = Integer.parseInt(sc.next());
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i] < c[j] && b[i] < d[j])
					p.add(new Pair(i, j));
			}
		}
		Pair[] q = p.toArray(new Pair[p.size()]);
		int[] s = new int[q.length];
		int[] t = new int[q.length];
		for (int i = 0; i < q.length; i++) {
			s[i] = q[i].i;
			t[i] = q[i].j;
		}
		int max = 0;
		for (int i = 0; i < 1<<q.length; i++) {
			String o = "%" + String.valueOf(q.length) + "s";
			String u[] = String.format(o, Integer.toBinaryString(i)).replaceAll(" ", "0").split("");
			int[] v = new int[q.length];
			for (int j = 0; j < q.length; j++) {
				v[j] = Integer.parseInt(u[j]);
			}
			boolean able = true;
			for (int j = 0; j < q.length; j++) {
				if (v[j] == 1) {
					for (int k = 0; k < q.length; k++) {
						if (v[k] == 1 && k != j) {
							if (s[j] == s[k] || t[j] == t[k]) {
								able = false;
								break;
							}
						}
					}
				}
				if (!able)
					break;
			}
			if (able) {
				int count = 0;
				for (int j = 0; j < q.length; j++) {
					count += v[j];
				}
				max = Math.max(max, count);
			}
		}
		System.out.println(max);
	}
}