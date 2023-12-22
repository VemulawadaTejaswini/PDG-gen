import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = 200001;


	void doIt() {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		while(true) {
			C -= B;
			if(C <= 0) {
				System.out.println("Yes");
				return;
			}
			A -= D;
			if(A <= 0) {
				System.out.println("No");
				return;
			}
		}
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
