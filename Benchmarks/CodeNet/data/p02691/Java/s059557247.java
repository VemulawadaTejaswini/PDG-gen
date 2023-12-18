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
		Map<Integer, Long> L = new HashMap<>();
		Map<Integer, Long> R = new HashMap<>();
		for(int i = 0; i < N; i++) {
			
			int l = i + A[i];
			if(L.containsKey(l)) {
				L.put(l, L.get(l) + 1);
			}
			else {
				L.put(l, 1l);
			}

			int r = i - A[i];
			if(R.containsKey(r)) {
				R.put(r, R.get(r) + 1);
			}
			else {
				R.put(r, 1l);
			}
		}
		long sum = 0;
		for(int i : L.keySet()) {
			if(R.containsKey(i)) {
				sum += L.get(i) * R.get(i);
			}
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
