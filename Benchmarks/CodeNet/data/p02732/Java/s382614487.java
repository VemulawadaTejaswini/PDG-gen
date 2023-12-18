import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;

	void doIt() {
		int N = sc.nextInt();
		int A[] = new int[N];
		int cnt[] = new int[N + 1];
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			cnt[A[i]]++;
			set.add(A[i]);
		}
		long sum = 0;
		for(int i : set) {
			sum += (cnt[i] * (cnt[i] - 1))/2;
		}
		for(int i = 0; i < N; i++) {
			long ans = sum;
			ans -= (cnt[A[i]] * (cnt[A[i]] - 1))/2;
			ans += ((cnt[A[i]] - 1) * (cnt[A[i]] - 2))/2;
			System.out.println(ans);
		}
		
		
	}

	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
