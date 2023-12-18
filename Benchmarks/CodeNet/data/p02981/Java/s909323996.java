import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;

	void doIt() {
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(Math.min(n * a, b));
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}
