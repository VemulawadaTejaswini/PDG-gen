import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S[] = new String[N];
		long num[] = new long[5];
		Arrays.fill(num, 0);
		for(int i = 0; i < N; i++) {
			S[i] = sc.next();
			if(S[i].substring(0, 1).equals("M")) {
				num[0]++;
			}
			if(S[i].substring(0, 1).equals("A")) {
				num[1]++;
			}
			if(S[i].substring(0, 1).equals("R")) {
				num[2]++;
			}
			if(S[i].substring(0, 1).equals("C")) {
				num[3]++;
			}
			if(S[i].substring(0, 1).equals("H")) {
				num[4]++;
			}
		}
		
		long ans = 0;
		int P[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2};
		int Q[] = {1, 1, 1, 2, 2, 3, 2, 2, 3, 3};
		int R[] = {2, 3, 4, 3, 4, 4, 3, 4, 4, 4};
		for(int i = 0; i < 10; i++) {
			ans += num[P[i]] * num[Q[i]] * num[R[i]];
		}
		System.out.println(ans);
	}
}
