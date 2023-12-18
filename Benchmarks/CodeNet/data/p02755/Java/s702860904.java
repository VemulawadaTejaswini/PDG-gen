import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = (int)1e6 + 1;

	void doIt() {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = -1;
		for(int i = 0; i < 1000000; i++) {
			if((int)(i * 0.08) != A) continue;
			if((int)(i * 0.1) != B) continue;
			ans = i;
			break;
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().doIt();
	}

}
