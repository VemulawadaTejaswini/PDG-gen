import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Double> paths = new ArrayList<>();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				double xdist = (double)Math.abs(x[i] - x[j]);
				double ydist =(double)Math.abs(y[i] - y[j]);
				double dist = Math.sqrt((xdist * xdist) + (ydist * ydist));
				paths.add(dist);
			}
		}
		double ans = 0.0;
		double fact = 1.0;
		if(n == 2) {
			ans = (double)paths.get(0);
			System.out.printf("%.10f", ans);
		}else {
			for(int i = 1; i < n - 1; i++) fact *= i;
			for(int i = 0; i < paths.size(); i++) {
				double temp = paths.get(i) * fact * (n - 1);
				temp *= 2;
				ans += temp;
			}
			ans /= fact * (n - 1) * n;
			System.out.printf("%.10f", ans);
		}
	}
}