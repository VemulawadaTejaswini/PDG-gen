import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		
		int ans = 0;
		for(int i = N - 1; i >= 0; i--) {
			int cnt = 0;
			if(A[i] % B[i] != 0) {
				cnt = B[i] - (A[i] % B[i]);
			}
			ans += cnt;
			for(int j = i - 1; j >= 0; j--) {
				A[j] += cnt;
			}
		}
		System.out.println(ans);
	}
}
