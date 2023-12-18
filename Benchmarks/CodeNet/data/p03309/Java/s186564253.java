import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		long max = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			max = Math.max(max, A[i]);
		}
		long ans = Integer.MAX_VALUE;
		outside : for(long i = 0; i < max; i++) {
			long temp = 0;
			for(int j = 0; j < N; j++) {
				temp += Math.abs(A[j] - (i + j + 1));
				if(temp > ans) {
					continue outside;
				}
			}
			ans = Math.min(ans, temp);
		}
		System.out.println(ans);
	}
}
