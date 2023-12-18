import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int ans[] = new int[n];
		for(int i = 0; i < n; i++) {
			ans[a[i] - 1] = i + 1;
		}
		for(int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
