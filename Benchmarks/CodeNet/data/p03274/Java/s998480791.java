import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		long[] A = new long[N + 1];
		for(int i = 0; i < N; i++) A[i] = sc.nextInt();
		A[N] = 0;
		Arrays.sort(A);
		int idx = Arrays.binarySearch(A, 0);
		// A[idx]から正の値をとる
		long ans = Long.MAX_VALUE;
		for(int i = 0; i + idx <= N; i++) {
			if(idx - K + i < 0) continue;
			// 正の方向にiだけろうそくに火をつけることを考える
			ans = Math.min(ans, A[i + idx] * (long)2 + Math.abs(A[idx - K + i]));
			ans = Math.min(ans, A[i + idx] + Math.abs(A[idx - K + i]) * (long)2);
		}
		System.out.println(ans);
	}
}