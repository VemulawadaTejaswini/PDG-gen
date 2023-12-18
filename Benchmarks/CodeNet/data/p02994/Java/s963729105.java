import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int n = sc.nextInt();
		int l = sc.nextInt();
		int min = MAX;
		int num = 0;
		for(int i = 0; i < n; i++) {
			int val = l + i;
			if(Math.abs(val) < min) {
				min = Math.abs(val);
				num = val;
			}
		}
		System.out.println(n * l + n * (n - 1) / 2 - num);
		
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
