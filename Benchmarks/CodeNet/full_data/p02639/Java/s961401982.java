import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	
	void doIt() {
		for(int i = 1; i <= 5; i++) {
			if(sc.nextInt() == 0) {
				System.out.println(i);
				return;
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
