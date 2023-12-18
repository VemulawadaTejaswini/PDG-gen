import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;

	int max3(int a, int b, int c) {
		int max = ((a < b) ? b : a);
		return (max < c)? c : max;
	}
	
	void doIt() {
		int n = sc.nextInt();
		int w[] = new int[n + 1];
		w[0] = 0;
		for(int i = 1; i <= n; i++) {
			w[i] = w[i - 1];
			w[i] += sc.nextInt();
		}
		int min = MAX;
		for(int i = 0; i <= n; i++) {
			int val = Math.abs(w[n] - w[i] * 2); 
			min = (min > val) ? val : min;
		}
		System.out.println(min);
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
