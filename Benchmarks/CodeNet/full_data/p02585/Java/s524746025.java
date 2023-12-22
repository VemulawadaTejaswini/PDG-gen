import java.util.*;

public class Main {
	
	long max, a;
	int[] p, c;
	int b;
	
	void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		p = new int[n];
		c = new int[n];
		for(int i = 0; i < n; i++) p[i] = scan.nextInt() - 1;
		for(int i = 0; i < n; i++) c[i] = scan.nextInt();
		max = Long.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			rec(i);
			a = 0;
			b = k;
		}
		System.out.println(max);
		scan.close();
	}
	
	void rec(int pos) {
		if(b == 0) return;
		a += c[p[pos]];
		if(max < a) max = a;
		b--;
		rec(p[pos]);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
