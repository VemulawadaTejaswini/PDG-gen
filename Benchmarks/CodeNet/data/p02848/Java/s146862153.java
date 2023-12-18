import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = 0;
	
	void doIt() {
		int n = sc.nextInt();
		String s = sc.next();
		char c[] = s.toCharArray();
		LEN = c.length;
		for(int i = 0; i < LEN; i++) {
			int num = (c[i] - 'A' + n) % 26;
			c[i] = (char)(num + 'A');
		}
		System.out.println(new String(c));
		
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
