

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	public Main() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double[] x = new double[3];
			double[] y = new double[3];
			for(int i=0;i<3;i++){
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			double xp = sc.nextDouble();
			double yp = sc.nextDouble();
			
			solve(x, y, xp, yp);
			
		}
	}
	
	public void solve(double[] x, double[] y, double xp, double yp) {
		boolean isOk = true;
		int sign = (x[1]-x[0])*(y[2]-y[0])-(x[2]-x[0])*(y[1]-y[0])<0 ? -1 : 1;
		for(int i=0;i<3;i++){
			double vx = x[(i+1)%3]-x[i];
			double vy = y[(i+1)%3]-y[i];
			
			if(sign * (vx*(yp-y[i]) - vy*(xp-x[i])) < 0)
				isOk = false;
		}
		System.out.println(isOk ? "YES" : "NO");
	}

}