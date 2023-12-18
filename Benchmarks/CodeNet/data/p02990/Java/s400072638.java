import java.util.Scanner;

public class Main {
	private static final int C = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		if (K == 1) {
			System.out.println(N-K+1);
			return;
		}
		
		int[] pa = {1, 1};
		int[] blues = new int[0];
		int[] reds = new int[0];
		int R = N - K + 1;
		
		for (int i = 3; i <= N; i++) {
			int[] tmp = new int[i];
			tmp[0] = 1;
			tmp[i-1] = 1;
			
			for (int j = 1; j < pa.length; j++) {
				tmp[j] = pa[j]%C + pa[j-1]%C;
			}
			
			if (i == K) { blues = tmp; }
			if (i == R + 1) { reds = tmp; }
			pa=tmp;
		}
		
		for (int i = 0; i < K; i++) {
			System.out.println((blues[i]%C)*(reds[i+1]%C));
		}
		sc.close();
	}
}