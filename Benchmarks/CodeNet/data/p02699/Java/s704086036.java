import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = 200001;


	void doIt() {
		System.out.println((sc.nextInt()<=sc.nextInt())?"unsafe":"safe");
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
