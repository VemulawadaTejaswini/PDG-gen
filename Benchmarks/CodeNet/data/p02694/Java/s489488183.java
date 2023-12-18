import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	
	void doIt() {
		long X = sc.nextLong();
		long num = 100;
		int cur = 0;
		
		while(X > num) {
			num *= 1.01;
			cur++;
		}
		System.out.println(cur);
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
