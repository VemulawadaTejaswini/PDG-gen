import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int p[] = new int[a];
		int q[] = new int[b];
		int r[] = new int[c];
		for (int i = 0; i < a; ++i)
			p[i] = sc.nextInt();
		Arrays.sort(p);
		for (int i = 0; i < b; ++i)
			q[i] = sc.nextInt();
		Arrays.sort(q);
		for (int i = 0; i < c; ++i)
			r[i] = sc.nextInt();
		Arrays.sort(r);
		sc.close();
		int pp = a - 1, pq = b - 1, pr = c - 1;
		int ans = 0;
		for (int i = 0; i < x + y; ++i) {
			int pd = (pp >= a - x ? p[pp] : 0);
			int qd = (pq >= b - y ? q[pq] : 0);
			int rd = (pr >= 0 ? r[pr] : 0);
			int max = Math.max(pd, qd);
			max = Math.max(max, rd);
			ans += max;
			if (pd == max)
				pp--;
			else if (qd == max)
				pq--;
			else if (rd == max)
				pr--;
		}
		System.out.println(ans);
	}
}
