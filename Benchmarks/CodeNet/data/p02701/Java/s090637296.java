import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = 200001;


	void doIt() {
		int N = sc.nextInt();
		Set<String> set = new HashSet<>();
		for(int i = 0; i < N; i++) {
			set.add(sc.next());
		}
		System.out.println(set.size());
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
