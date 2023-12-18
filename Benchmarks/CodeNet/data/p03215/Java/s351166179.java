import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		long[] subseq = new long[N * (N + 1) / 2];
		long[] A = new long[N + 1];
		for(int i = 1; i < N + 1; i++) A[i] = sc.nextLong();
		for(int i = 1; i < N + 1; i++) A[i] += A[i - 1];

		int ind = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = i; j <= N; j++) {
				// Subsequence of (i, j)
				subseq[ind] = A[j] - A[i - 1];
				ind++;
			}
		}
		Arrays.sort(subseq);
		System.out.println(subseq[N * (N + 1) / 2 - K]);
	}
}
