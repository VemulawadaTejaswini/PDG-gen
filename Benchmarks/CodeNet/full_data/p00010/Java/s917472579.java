import java.util.*;

public class Main {
	
	static double[] solve(double a, double b, double c, double d, double e, double f){
			double det = a*e-b*d;
			double[] ans = new double[2];
			ans[0] = (c*e-b*f)/det;
			ans[1] = (a*f-c*d)/det;
			for(int i=0; i<2; i++) if(ans[i]==-0) ans[i] = 0;
			return ans;
	}
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		for(int i=0; i<n; i++){
			double x1 = stdIn.nextDouble();
			double y1 = stdIn.nextDouble();
			double x2 = stdIn.nextDouble();
			double y2 = stdIn.nextDouble();
			double x3 = stdIn.nextDouble();
			double y3 = stdIn.nextDouble();
		
			double[] ans = solve(x1-x2,y1-y2,x1*(x1-x2)+y1*(y1-y2),x3-x2,y3-y2,x3*(x3-x2)+y3*(y3-y2));
			double xp,yp,r;
			xp = (x2 + ans[0])/2.0;
			yp = (y2 + ans[1])/2.0;
			r = Math.sqrt((xp-x2)*(xp-x2)+(yp-y2)*(yp-y2));
			System.out.printf("%.3f %.3f %.3f",xp,yp,r);
			System.out.println();
		}
	}

}