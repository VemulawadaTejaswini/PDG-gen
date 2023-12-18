import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 100000;

	void doIt() {
		int l = sc.nextInt();
		int r = sc.nextInt();
		if(r - l >= 2019) {
			System.out.println(0);
		}
		else if(r % 2019 < l % 2019) {
			System.out.println(0);
			
		}
		else {
			
			l %= 2019;
			r %= 2019;
			int n = (l > 2019 - r)?2019 - r:l;
			System.out.println(n * (n + 1));
		}
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
