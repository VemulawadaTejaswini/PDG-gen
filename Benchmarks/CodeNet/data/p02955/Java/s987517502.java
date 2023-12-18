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
			int[] B = new int[N];
			for(int j = 0; j < N; j++)
				B[j] = A[j] % i;
			Arrays.sort(B);
			int[] M = new int[N+1];
			int[] P = new int[N+1];
			for(int j = 0; j < N; j++)
				M[j+1] = M[j] + B[j];
			for(int j = N-1; j >= 0; j--)
				if(B[j] != 0)
					P[j] = P[j+1] + (i - B[j]);
			for(int j = 1; j < N; j++)
				if((M[j] - P[j]) % i == 0)
					min = Math.min(min, Math.max(M[j], P[j]));
			if(min <= K)
				ans = Math.max(ans, i);
		}
		System.out.println(ans);
	}

}