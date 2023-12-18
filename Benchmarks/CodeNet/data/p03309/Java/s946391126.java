import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong() - (i + 1);
		}
		
		Arrays.sort(A);
		long b = A[N / 2];
		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += Math.abs(A[i] - b);
		}
		
		System.out.println(ans);
    }
}
