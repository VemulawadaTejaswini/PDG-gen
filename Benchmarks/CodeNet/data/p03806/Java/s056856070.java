import java.util.*;

public class Main {
	static ArrayList<Integer> costs = new ArrayList<>();
	static Med[] med;
	static int n;
	static int ma;
	static int mb;
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ma = sc.nextInt();
		mb = sc.nextInt();
		med = new Med[n];
		for (int i = 0; i < n; i++) {
			med[i] = new Med(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		search(0, 0, 0, 0);
		if (costs.size() == 0) {
			System.out.println(-1);
			return;
		}
		int min = Integer.MAX_VALUE;
		for (int x : costs) {
			if (min > x) {
				min = x;
			}
		}
		
		System.out.println(min);
	}
	
	static void search(int idx, int a, int b, int c) {
		if (idx == n) {
			return;
		}
		search(idx + 1, a, b, c);
		int xa = a + med[idx].a;
		int xb = b + med[idx].b;
		int xc = c + med[idx].c;
		if (xa % ma == 0 && xb % mb == 0 && xa / ma == xb / mb) {
			costs.add(xc);
		} else {
			search(idx + 1, xa, xb, xc);
		}
	}
	
	static class Med {
		int a;
		int b;
		int c;
		public Med(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
}
