import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MOD = 998244353;
		int N = sc.nextInt();
		int S = sc.nextInt();
		int[] A = new int[N];
		Arrays.setAll(A, i -> sc.nextInt());
		long ans = 0;
		long[] t = new long[N+1];
		t[0] = 1;
		for(int i = 1; i <= N; i++)
			t[i] = t[i-1] * 2 % MOD;
		Map<Integer, List<Integer>> m = new HashMap<>();
		m.put(0, new ArrayList<>());
		m.get(0).add(0);
		for(int i = 0; i < N; i++) {
			for(int j = i; j >= 0; j--) {
				if(!m.containsKey(j+1))
					m.put(j+1, new ArrayList<>());
				for(int k : m.get(j))
					if(k + A[i] <= S)
						m.get(j+1).add(k + A[i]);
			}
		}
		for(int i = 1; i <= N; i++) {
			int c = 0;
			for(int j : m.get(i))
				if(j == S)
					c++;
			ans += c * t[N-i];
			ans %= MOD;
		}
		System.out.println(ans);
	}

}
