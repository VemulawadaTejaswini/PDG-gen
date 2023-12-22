import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	
	void doIt() {
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int i = 0; i < N; i++) {
			int count = 1;
			for(int j : fac(A[i])) {
				//System.out.println(A[i] + ":" + j);
				if(set.contains(j)) {
					count = 0;
					//System.out.println(A[i]);
					break;
				}
			}
			if(A[i] == A[(i + 1) % N]) count = 0;
			sum += count;
			set.add(A[i]);
		}
		if(A.length == 1)sum = 1;
		System.out.println(sum);
	}
	
	List<Integer> fac(int n) {
		List<Integer> li = new ArrayList<>();
		for(int i = 1; i * i <= n; i++) {
			if(n % i == 0) {
				li.add(i);
				li.add(n / i);
			}
		}
		return li;
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
