import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	void doIt() {
		String S = sc.next();
		String T = sc.next();
		System.out.println((S.equals(T.substring(0, T.length() - 1)))?"Yes":"No");
		
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
