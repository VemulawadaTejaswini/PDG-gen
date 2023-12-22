import java.util.*;

public class Main {
	
	long max, a;
	int[] p, c;
	int b;
	ArrayList<Integer> seen;
	
	void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		p = new int[n];
		c = new int[n];
		for(int i = 0; i < n; i++) p[i] = scan.nextInt() - 1;
		for(int i = 0; i < n; i++) c[i] = scan.nextInt();
		max = Long.MIN_VALUE;
		seen = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			rec(i, Long.MIN_VALUE);
			a = 0;
			b = k;
		}
		System.out.println(max);
		scan.close();
	}
	
	void rec(int pos, long cmax) {
		if(b == 0) return;
		boolean isUpdated = false;
		a += c[p[pos]];
		if(max < a) {
			max = a;
			isUpdated = true;
		}
		b--;
		seen.add(pos);
		if(!isUpdated && seen.contains(pos)) return;
		rec(p[pos], max);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
