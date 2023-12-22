

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(",|(\\s+)");
		
		while(sc.hasNext()){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double xp = sc.nextDouble();
			double yp = sc.nextDouble();
			solve(x1, y1, x2, y2, xp, yp);
		}
	}

	private void solve(double x1, double y1, double x2, double y2, double xp,
			double yp) {

		double vxp = xp-x1;
		double vyp = yp-y1;
		double vx = x2-x1;
		double vy = y2-y1;
		
		double angle = (Math.atan2(vyp, vxp) - Math.atan2(vy, vx))*(-2);
		double resx = Math.cos(angle)*vxp - Math.sin(angle)*vyp+x1;
		double resy = Math.sin(angle)*vxp + Math.cos(angle)*vyp+y1;
		System.out.println(String.format("%.6f %.6f", resx, resy));
		
	}


}