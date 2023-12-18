import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
 
	void doIt() {
		int n = sc.nextInt();
		if(n >= 1000 && n <= 9999) {
			n = 909;
		}
		else if(n >= 10 && n <= 99) {
			n = 9;
		}
		else {
			if(n >= 100000) {
				n -= 9091;
			}
			else if(n >= 1000) {
				n -= 9090;
			}
			else if(n >= 10) {
				n-=90;
			}
			
		}
		System.out.println(n);
	}
 
	public static void main(String[] args) {
		new Main().doIt();
	}
}