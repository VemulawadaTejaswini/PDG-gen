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
		if(r - l > 2019) {
			System.out.println(0);
		}
		
		else {
			long min = LMAX;
			for(int i = l; i <= r; i++) {
				for(int j = i + 1; j <= r; j++) {
					if(min > (i * j) % 2019) {
						min = (i * j) % 2019;
					}
				}
			}
			System.out.println(min);
		}
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
