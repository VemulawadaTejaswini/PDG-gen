import java.util.Scanner;

/**
 * 172 Beginner
 * C:Tsundoku
 */
public class Main {
	public static void main(String[] args){
		// input
		Scanner inData = new Scanner(System.in);

		// line1
		int N = inData.nextInt();
		int M = inData.nextInt();
		long K = inData.nextLong();

		long[] A = new long[N];
		for(int i=0; i<N; i++) 	A[i] = inData.nextLong();

		long[] B = new long[M];
		for(int i=0; i<M; i++) B[i] = inData.nextLong();

		int max = N <= M ? M : N;

		long sum = 0;
		int cnt = 0;

		for (int i = 0; i < max; i++) {
			if (i < N && i < M) {
				if (A[i] <= B[i]) {
					sum += A[i];
					cnt++;
				} else {
					sum += B[i];
					cnt++;
				}
				if (sum > K) {cnt--; break;}
				if (A[i] <= B[i]) {
					sum += A[i];
					cnt++;
				} else {
					sum += B[i];
					cnt++;
				}
				if (sum > K) {cnt--; break;}
			} else {
				if (N < M) {
					sum += B[i];
					cnt++;
				} else {
					sum += A[i];
					cnt++;
				}
				if (sum > K) {cnt--; break;}
			}
		}
		System.out.println(cnt);
		inData.close();
	}

}
