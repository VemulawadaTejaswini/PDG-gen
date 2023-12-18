import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		int ans = 0;
		
		if(K == 0) {
			System.out.println(N * N);
			return;
		}
		
		for(int b = 1; b <= N; b++) {
			int temp = b - K > 0 ? b - K : 0;
			ans += (N / b) * temp;
			ans += (N % b) - K + 1 > 0 ? (N % b) - K + 1 : 0;
		}
		System.out.println(ans);
	}
}
