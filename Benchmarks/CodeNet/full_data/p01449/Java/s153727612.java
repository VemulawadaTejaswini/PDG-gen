import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int[] p, q;
	boolean[] checked;
	int n, f;
	int calc(int k, int d) {
		checked[k] = true;
		if (d > 0 && k == f) return q[k] = -1;
		if (p[k] == 0) return q[k] = k;
		return q[k] = calc(p[k] > 0 ? min(k+p[k], n-1) : max(k+p[k], 0), d+1);
	}
	
	void run() {
		n = sc.nextInt();
		p = new int[n];
		q = new int[n];
		checked = new boolean[n];
		for (int i = 0; i < n; i++)
			p[i] = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (!checked[i]) {
				f = i;
				calc(i, 0);
			}
		}
		Queue<Integer> num = new LinkedList<Integer>();
		Queue<Integer> count = new LinkedList<Integer>();
		boolean[] used = new boolean[n];
		num.add(0);
		count.add(0);
		used[0] = true;
		while (!num.isEmpty()) {
			int k = num.poll(), c = count.poll();
			if (k == n-1) {
				out.println(c);
				return;
			}
			for (int i = 1; i <= 6; i++) {
				if (!used[min(k+i, n-1)] && q[min(k+i, n-1)] > 0) {
					used[min(k+i, n-1)] = used[q[min(k+i, n-1)]] = true;
					num.add(q[min(k+i, n-1)]);
					count.add(c+1);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}