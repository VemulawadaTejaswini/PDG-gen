import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void quickSort_ascend(int[] a, int[] b, int[] c, int l, int r) {
		if (l < r) {
			int w = a[(l+r)/2];
			int i = l, j = r, temp;
			while (i < j) {
				while (a[i] < w) i++;
				while (a[j] > w) j--;
				if (i <= j) {
					temp = a[i];
					a[i] = a[j]; a[j] = temp;
					temp = b[i];
					b[i] = b[j]; b[j] = temp;
					temp = c[i];
					c[i] = c[j]; c[j] = temp;
					i++; j--;
				}
			}
			quickSort_ascend(a, b, c, l, j);
			quickSort_ascend(a, b, c, i, r);
		}
	}
	
	void run() {
		int n, m;
		while (true) {
			n = sc.nextInt(); m = sc.nextInt();
			if (n == 0 && m == 0) break;
			int[] t = new int[m];
			int[] s = new int[m];
			int[] d = new int[m];
			for (int i = 0; i < m; i++) {
				t[i] = sc.nextInt();
				s[i] = sc.nextInt();
				d[i] = sc.nextInt();
			}
			quickSort_ascend(t,s,d,0,m-1);
			boolean[] comp = new boolean[n+1];
			comp[1] = true;
			if (m > 0) {
				int time = t[0];
				List<Integer> list = new ArrayList<Integer>();
				for (int i = 0; i < m; i++) {
					if (t[i] == time) {
						if (comp[s[i]]) list.add(d[i]);
					} else {
						for (int k : list)
							comp[k] = true;
						list.clear();
						time = t[i];
						if (comp[s[i]]) list.add(d[i]);
					}
				}
				
				for (int k : list)
					comp[k] = true;
			}
			
			int ans = 0;
			for (int i = 1; i <= n; i++)
				if (comp[i])
					ans++;
			
			out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}