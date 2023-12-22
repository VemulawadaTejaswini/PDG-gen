import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	double calc(int _p, int _a, int _b, int _c, int _d, int _e, int _f, int _s, int _m) {
		double p = (double)_p, a = (double)_a, b = (double)_b, c = (double)_c, d = (double)_d, e = (double)_e, f = (double)_f, s = (double)_s, m = (double)_m;
		double t1 = a+b+c, t2 = d+e;
		return (s*f*m-p)/(t1+t2*m);
	}
	
	void sort(String[] s, double[] d) {
		int n = s.length;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				if (d[j] < d[j+1] || (d[j] == d[j+1] && s[j].compareTo(s[j+1]) > 0)) {
					double tempd = d[j];
					d[j] = d[j+1];
					d[j+1] = tempd;
					String temps = s[j];
					s[j] = s[j+1];
					s[j+1] = temps;
				}
			}
		}
	}
	
	void run() {
		int n;
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			String[] s = new String[n];
			double[] eff = new double[n];
			for (int i = 0; i < n; i++) {
				s[i] = sc.next(); 
				eff[i] = calc(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			}
			
			sort(s, eff);
			for (String st : s)
				out.println(st);
			out.println("#");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}