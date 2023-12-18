import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i < n; i++)
			if(sc.nextInt() >= k)cnt++;
		System.out.println(cnt);
		
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
