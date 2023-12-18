import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	
	void doIt() {
		String S = sc.next();
		System.out.println((S.equals("ABC")?"ARC":"ABC"));
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
