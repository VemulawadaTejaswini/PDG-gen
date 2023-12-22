import java.util.*;
public class Main {

	private double outer_product(double x, double y, double x1, double y1, double x2, double y2){
		x1 = x1 - x;
		y1 = y1 - y;
		x2 = x2 - x;
		y2 = y2 - y;
		double s = x1 * y2 - y1 * x2;
		return s;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double [] x = new double[3];
			double [] y = new double[3];
			for(int i=0; i < 3; i++){
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			double xp = sc.nextDouble();
			double yp = sc.nextDouble();
			boolean [] ans = new boolean[3];
			for(int i=0; i < 3; i++){
				ans[i] = outer_product(xp, yp, x[i], y[i], x[(i+1)%3], y[(i+1)%3]) > 0.0;
			}
			if(ans[0] == ans[1] && ans[1] == ans[2]){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}