import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		int N = S.length;
		int[] ans = new int[N];
		Arrays.fill(ans, 1);
		int[] cons = new int[N];
		Arrays.fill(cons, 1);
		for(int i = 1; i < N; i++) {
			if(S[i] == 'R' && S[i] == S[i-1]) {
				ans[i] += ans[i-1];
				ans[i-1] = 0;
				cons[i] = cons[i-1];
				cons[i]++;
			}
		}
		for(int i = N-2; i >= 0; i--) {
			if(S[i] == 'L' && S[i] == S[i+1]) {
				ans[i] += ans[i+1];
				ans[i+1] = 0;
				cons[i] = cons[i+1];
				cons[i]++;
			}
		}
		for(int i = 1; i < N; i++) {
			if(S[i] == 'L' && S[i] != S[i-1]) {
				int T = ans[i] + ans[i-1];
				if(cons[i-1] % 2 == 0 && cons[i] % 2 == 1) {
					ans[i-1] = T/2;
					ans[i] = (T+1)/2;
				}
				else {
					ans[i-1] = (T+1)/2;
					ans[i] = T/2;
				}
			}
		}
		for(int i = 0; i < N; i++)
			System.out.print(ans[i] + " ");
		System.out.println();

	}

}