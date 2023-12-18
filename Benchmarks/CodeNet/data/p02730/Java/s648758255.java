import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;

	void doIt() {
		String S = sc.next();
		int N = S.length();
		StringBuilder strb = new StringBuilder(S);
		strb.reverse();
		if(!S.equals(strb.toString())) {
			System.out.println("No");
			return;
		}
		String s = S.substring(0, (N - 1)/2);
		strb = new StringBuilder(s);
		strb.reverse();
		if(!s.equals(strb.toString())) {
			System.out.println("No");
			return;
		}
		s = S.substring((N + 3)/2 - 1);
		strb = new StringBuilder(s);
		strb.reverse();
		if(!s.equals(strb.toString())) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}

	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
