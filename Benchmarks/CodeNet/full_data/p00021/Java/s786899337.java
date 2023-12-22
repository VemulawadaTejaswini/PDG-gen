import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	
	static Scanner sc = new Scanner(System.in);
	static final double EPS = 1e-12;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		double x1,y1,x2,y2,x3,y3,x4,y4;
		while(n-- > 0) {
			x1 = sc.nextDouble();y1 = sc.nextDouble();x2 = sc.nextDouble();y2 = sc.nextDouble();x3 = sc.nextDouble();y3 = sc.nextDouble();x4 = sc.nextDouble();y4 = sc.nextDouble();
			double a1 = (y2 - y1) / (x2 - x1), a2 = (y4 - y3) / (x4 - x3);
			if(Math.abs(a2 - a1) < EPS) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}