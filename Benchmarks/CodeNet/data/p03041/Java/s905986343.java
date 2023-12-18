import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;

	void doIt() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		char[] ca = s.toCharArray();
		ca[k - 1] += 32;
		System.out.println(new String(ca));
		
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
