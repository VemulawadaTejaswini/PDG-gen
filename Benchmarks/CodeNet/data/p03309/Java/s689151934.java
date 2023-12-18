import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		long B[] = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = A[i];
		}
		Arrays.sort(B);
		long center = B[N / 2];
		int ans = Integer.MAX_VALUE;
		for(int i = -10000; i < 10000; i++) {
			int temp = 0;
			for(int j = 0; j < N; j++) {
				temp += Math.abs(A[j] - (center + i + j + 1));
			}
			ans = Math.min(temp, ans);
		}
		
		System.out.println(ans);
	}
}
