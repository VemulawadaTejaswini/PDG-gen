import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	
	void doIt() {
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int len = K;
		while(len <= B) {
			if(A <= len) {
				System.out.println("OK");
				return;
			}
			
			len += K;
		}
		System.out.println("NG");
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
