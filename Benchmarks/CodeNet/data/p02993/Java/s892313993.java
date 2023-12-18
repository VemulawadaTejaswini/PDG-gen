import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		char[] s = sc.next().toCharArray();
		for(int i = 1; i < 4; i++) {
			if(s[i - 1] == s[i]) {
				System.out.println("Bad");
				return;
			}
			
		}
		System.out.println("Good");
		
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
