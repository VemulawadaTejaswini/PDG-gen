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
		Map<Integer, Long> R = new HashMap<>();
		for(int i = 0; i < N; i++) {
			int r = i - A[i];
			if(R.containsKey(r)) {
				R.put(r, R.get(r) + 1);
			}
			else {
				R.put(r, 1l);
			}
		}
		long sum = 0;
		
		for(int i = 0; i < N; i++) {
			int l = i + A[i];
			if(R.containsKey(l)) {
				sum += R.get(l);
			}
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
