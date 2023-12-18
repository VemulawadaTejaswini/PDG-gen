import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		int sum = 0, ans = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		Set<Integer> cd = new HashSet<>();
		for(int i = 1; i <= Math.sqrt(sum); i++)
			if(sum % i == 0) {
				cd.add(i);
				cd.add(sum/i);
			}
		for(int i : cd) {
			int min = Integer.MAX_VALUE;
			int[] B = new int[N];
			for(int j = 0; j < N; j++)
				B[j] = A[j] % i;
			Arrays.sort(B);
			int[] S = new int[N+1];
			for(int j = 0; j < N; j++)
				S[j+1] = S[j] + B[j];
			if(S[N-S[N]/i] <= K)
				ans = Math.max(ans, i);
		}
		System.out.println(ans);
	}

}