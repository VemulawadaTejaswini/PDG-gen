import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	
	void doIt() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			System.out.println((N / 2 - i) + " " + (N / 2 + i + 1));
		}
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
