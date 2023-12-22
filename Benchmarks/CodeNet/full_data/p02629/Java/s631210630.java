import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	long inf = LMAX / 2 - MAX;

	void doIt() {
		long N = sc.nextLong() - 1;
		LinkedList<Integer> stack = new LinkedList<>();
		while(N >= 0) {
			stack.push((int)(N % 26));
			N -= 26;
			if(N < 0) break;
			N /= 26;
		}
		while(!stack.isEmpty()) {
			int c = stack.pollFirst();
			System.out.print((char)(c + 'a'));
		}
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
