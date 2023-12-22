import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	public void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		reader.close();
		
		System.out.println(getMinCost(n, a));
	}
	
	private int getMinCost(int n, int[] a) {
		
		boolean[] flags = new boolean[n];
		int[] b = new int[n];
		int mn = Integer.MAX_VALUE;
		int mx = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			b[i] = a[i];
			mn = Math.min(mn, a[i]);
			mx = Math.max(mx, a[i]);
		}
		Arrays.sort(b);
		
		int[] p = new int[mx + 1];
		for (int i = 0; i < n; i++) {
			p[b[i]] = i;
		}
		
		int cost = 0;
		for (int i = 0; i < n; i++) {
			if (flags[i]) continue;
			int idx = i;
			int sum = 0;
			int cnt = 0;
			int m = Integer.MAX_VALUE;
			while (true) {
				flags[idx] = true;
				cnt++;
				int val = a[idx];
				sum += val;
				m = Math.min(m, val);
				idx = p[val];
				if (flags[idx]) break;
			}
			int c1 = sum + (cnt - 2) * m;
			int c2 = c1 + 2 * (m + mn);
			c2 -= (cnt - 1) * (m - mn);
			cost += Math.min(c1, c2);
		}
		return cost;
	}
}

