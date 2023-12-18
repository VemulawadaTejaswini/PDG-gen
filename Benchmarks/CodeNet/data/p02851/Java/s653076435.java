import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long K = scn.nextLong();
		long[] A = new long[N];
		long[] sum = new long[N+1];
		for(int i = 0;i < N;i++) {
			A[i] = scn.nextLong();
			sum[i+1] = A[i] + sum[i];
		}
		int ans = 0;
		for(int i = 1;i <= N;i++) {
			for(int j = 0;j <= N-i;j++) {
				if((sum[j+i] - sum[j])%K == i)ans++;
			}
		}
		System.out.println(ans);
	}

}
