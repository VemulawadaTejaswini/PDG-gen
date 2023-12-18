import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		long sum[] = new long[N + 1];
		int A[] = new int[N + 1];
		sum[0] = 0;
		A[1] = Integer.parseInt(sc.next());
		sum[1] = A[1];
		for(int i = 2; i <= N; i++) {
			A[i] = Integer.parseInt(sc.next());
			sum[i] = sum[i - 1] + A[i];
		}
		
		long ans = 0;;
		for(int i = 1; i <= N; i++) {
			for(int j = i; j <= N; j++) {
				if((sum[j] - sum[i - 1]) % M == 0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
