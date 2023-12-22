import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;

	void doIt() {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		double argA = Math.PI * (double)H / 6.0 + Math.PI * (double)M / 6.0 / 60.0;
		double argB = Math.PI * (double)M / 30.0;
		double Ax = A * Math.cos(argA);
		double Ay = A * Math.sin(argA);
		double Bx = B * Math.cos(argB);
		double By = B * Math.sin(argB);
		double ans = Math.sqrt((Ax - Bx) * (Ax - Bx) + (Ay - By) * (Ay - By));
		System.out.println(ans);
	}

	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
