import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] S = new long[N+1];
		for(int i = 1; i <= N; i++)
			S[i] = (S[i-1] + sc.nextInt() - 1) % K;
		long ans = 0;
		Map<Long, Integer> m = new HashMap<>();
		int j = 0;
		for(int i = 0; i <= N; i++) {
			if(i - j == K) {
				m.put(S[j], m.get(S[j]) - 1);
				j++;
			}
			ans += m.getOrDefault(S[i], 0);
			m.put(S[i], m.getOrDefault(S[i], 0) + 1);
		}
		System.out.println(ans);
	}

}