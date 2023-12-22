import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long D = sc.nextLong();
		double T = sc.nextDouble();
		long S = sc.nextLong();
		solve(D, T, S);
	}

	private static void solve(long d, double t, long s) {
		// TODO Auto-generated method stub
		//formula : d = vt
		// t = d / v;
		double res = d / s;
		if (res <= t) System.out.println("Yes");
		else System.out.println("No");
	}

}
