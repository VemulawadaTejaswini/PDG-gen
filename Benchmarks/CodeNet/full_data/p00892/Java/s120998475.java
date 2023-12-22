import java.util.*;
public class Main {
	int m,n;
	int [] x1,x2,y1,z2;
	int INF = 1 << 24;
	
	//SYAKYO
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			m = sc.nextInt();
			n = sc.nextInt();
			if((m | n) == 0) break;
			x1 = new int[m];
			y1 = new int[m];
			x2 = new int[n];
			z2 = new int[n];
			for(int i = 0 ; i < m; i++){
				x1[i] = sc.nextInt();
				y1[i] = sc.nextInt();
			}
			for(int i = 0 ; i < n; i++){
				x2[i] = sc.nextInt();
				z2[i] = sc.nextInt();
			}
			solve();
		}
	}
	private void solve() {
		int min1 = minAll(x1);
		int max1 = maxAll(x1);
		int min2 = minAll(x2);
		int max2 = maxAll(x2);
		ArrayList<Integer> xs = new ArrayList<Integer>();
		for(int i = 0 ; i < m; i++){
			xs.add(x1[i]);
		}
		for(int i = 0 ; i < n; i++){
			xs.add(x2[i]);
		}
		Collections.sort(xs);
		
		double res = 0;
		for(int i = 0 ; i + 1 < xs.size(); i++){
			double a = xs.get(i), b = xs.get(i+1), c = (a + b) / 2;
			if(min1 <= c && c <= max1 && min2 <= c && c <= max2){
				double fa = width(x1, y1, m, a) * width(x2, z2, n, a);
				double fb = width(x1, y1, m, b) * width(x2, z2, n, b);
				double fc = width(x1, y1, m, c) * width(x2, z2, n, c);
				res += (b-a) / 6 * (fa + 4 * fc + fb);
			}
		}
		System.out.printf("%.10f\n", res);
	}
	private double width(int[] X, int[] Y, int n, double x) {
		double lb = INF, ub = -INF;
		for(int i = 0 ; i < n; i++){
			double x1 = X[i], y1 = Y[i], x2 = X[ (i + 1) % n], y2 = Y[(i+1) % n];
			if((x1 - x) * (x2 - x) <= 0 && x1 != x2){
				double y = y1 + (y2 - y1) * (x - x1) / (x2 - x1);
				lb = Math.min(lb,  y);
				ub = Math.max(ub, y);
			}
		}
		return Math.max(0.0, ub - lb);
	}
	private int minAll(int[] x) {
		int res = x[0];
		for(int i = 1; i < x.length; i++){
			res = Math.min(res, x[i]);
		}
		return res;
	}
	
	private int maxAll(int[] x) {
		int res = x[0];
		for(int i = 1; i < x.length; i++){
			res = Math.max(res, x[i]);
		}
		return res;
	}
	
	public static void main(String [] args){
		new Main().doit();
	}
}