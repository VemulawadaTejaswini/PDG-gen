import java.util.Scanner;

public class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}

	class line {
		double px;
		double py;
		double qx;
		double qy;

		line(double x1, double y1, double x2, double y2) {
			px = x1;
			py = y1;
			qx = x2;
			qy = y2;
		}


	}

	boolean ccw(line a, double px, double py) {
		double pp2x = a.px - px;
		double pp2y = a.py - py;
		double pq2x = a.qx - px;
		double pq2y = a.qy - py;
		

		if(pq2y*pp2x - pq2x*pp2y < -1e-8){
			return false;
		}
		return true;
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			double[] sx = new double[n];
			double[] sy = new double[n];

			for (int i = 0; i < n; i++) {
				sx[i] = sc.nextDouble();
				sy[i] = sc.nextDouble();
			}

			line l[] = new line[n];

			l[0] = new line(sx[0], sy[0], sx[n - 1], sy[n - 1]);
			for (int i = 1; i < n; i++) {
				l[i] = new line(sx[i], sy[i], sx[i - 1], sy[i - 1]);
			}

			boolean res = false;
			for (int i = 0; i < n; i++) {
				boolean ok = true;
				for (int j = 0; j < n; j++) {
					if(i==j || j == i+1 || (i==n-1&&j==0)){
						continue;
					}
//					System.out.println(j+" "+i);
					if(ccw(l[j],sx[i],sy[i])){
//						System.out.println(j+" "+i);
						ok = false;
//						break;
					}else{
//						System.out.println(" "+j+" "+i);
					}
				}
				if(ok){
					res = true;
					break;
				}
			}

			System.out.println(res ? "1" : "0");

		}
	}

	public static void main(String args[]) {
		Main m = new Main();
		m.run();
	}
}