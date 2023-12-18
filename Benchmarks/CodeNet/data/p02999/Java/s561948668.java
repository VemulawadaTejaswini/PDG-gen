import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int x = sc.nextInt();
		int a = sc.nextInt();
		if(x < a) System.out.println(0);
		else System.out.println(10);
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}
