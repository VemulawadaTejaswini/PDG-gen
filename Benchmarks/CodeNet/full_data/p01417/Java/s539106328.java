import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	double max = 0;
	double[] l, a, b;
	int n, m;
	boolean[] check;
	
	void calc(int d, int pre) {
		if (d == m) {
			double sum = 0;
			for (int i = 0; i < n-1; i++) {
				if (check[i]) {
					for (int j = i+1; j < n; j++) {
						if (check[j])
							sum += (l[i]-l[j])*(l[i]-l[j])+(a[i]-a[j])*(a[i]-a[j])+(b[i]-b[j])*(b[i]-b[j]);
					}
				}
			}
			max = Math.max(max, sum);
		} else {
			for (int i = pre+1; i < n; i++) {
				check[i] = true;
				calc(d+1, i);
				check[i] = false;
			}
		}
	}
	
	void run() {
		n = sc.nextInt();
		m = sc.nextInt();
		l = new double[n];
		a = new double[n];
		b = new double[n];
		check = new boolean[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextDouble();
			a[i] = sc.nextDouble();
			b[i] = sc.nextDouble();
		}
		
		calc(0, -1);
		out.printf("%.20f", max);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}