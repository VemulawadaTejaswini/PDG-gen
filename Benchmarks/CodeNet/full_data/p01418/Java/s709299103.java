import java.util.*;

public class Main{
	double p,e,t;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int k = sc.nextInt();
			int l = sc.nextInt();
			int r = sc.nextInt();
			p = sc.nextDouble();
			e = sc.nextDouble();
			t = sc.nextDouble();
			double res = solve(k, l, r);
			System.out.printf("%.6f\n",res);
		}
	}

	private double solve(int k, double l, double r) {
		double h = (r + l) / 2;
		if(k == 0){
			if(t - e <= h && h <= t + e){
				return 1;
			}
			else{
				return 0;
			}
		}
		
		if((r < t - e && l < t - e) || (r > t + e && l > t + e)){
			return 0;
		}
		if(t - e <= l && r <= t + e){
			return 1;
		}
		
		if(h <= t){
			return (1-p) * solve(k-1, h, r) + p * solve(k-1, l, h);
		}
		else{
			return (1-p) * solve(k-1, l, h) + p * solve(k-1, h, r);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}