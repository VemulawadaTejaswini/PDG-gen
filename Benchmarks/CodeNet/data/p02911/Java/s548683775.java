import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int num[] = new int[n];
		Arrays.fill(num, 0);
		for(int i = 0; i < q; i++) 
			num[sc.nextInt() - 1]++;
		for(int i = 0; i < n; i++) {
			System.out.println((k - q + num[i] > 0)?"Yes":"No");
		}
		
	}
		
	
	

	public static void main(String[] args) {
		new Main().doIt();
	}
}
