import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = 0;
	
	void doIt() {
		 char[] s = sc.next().toCharArray();
		 int d = s.length / 2;
		 for(int i = 0; i < s.length - d; i++) {
			 if(s[i] == s[i + d]) continue;
			 System.out.println("No");
			 return;
		 }
		System.out.println("Yes");
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
