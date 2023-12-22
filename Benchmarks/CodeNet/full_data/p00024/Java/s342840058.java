import java.util.*;


public class Main {

	/**
	 * @param args
	 */
	
	static Scanner sc = new Scanner(System.in);
	//static final double EPS = 1e-10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double y;
		while(sc.hasNextDouble()) {
			y = y(sc.nextDouble());
			int ans = 1;
			while(h(ans) < y) ans++;
			System.out.println(ans);
		}
	}
	
	static double y(double v) {
		return 0.0510204081632653 * v * v;
	}
	
	static double h(int n) {
		return (double)(5 * n - 5);
	}

}