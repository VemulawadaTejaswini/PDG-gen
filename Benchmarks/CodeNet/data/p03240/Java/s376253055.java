import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	static int n, H;
	void doIt() {
		n = sc.nextInt();
		int[] x= new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		int pos = 0;
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
			if(h[i] > 0) pos = i;
		}

		for(int i = 0; i <= 100; i++) {
			for(int j = 0; j <= 100; j++) {
				if(solve(i, j, pos, x, y, h)) {
					System.out.println(i+" "+j+" "+H);
					return;
				}
			}
		}
	}
	boolean solve(int cx, int cy, int pos, int[] x, int[] y, int[] h) {
		int cand = h[pos] + Math.abs(x[pos] - cx) + Math.abs(y[pos] - cy);
		for(int i = 1; i < n; i++) {
			if(h[i] != Math.max(cand - Math.abs(x[i] - cx) - Math.abs(y[i] - cy), 0)) {
				return false;
			}
		}
		H = cand;
		return true;
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
