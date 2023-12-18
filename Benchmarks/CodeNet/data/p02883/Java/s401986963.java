import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long K = scn.nextInt();
		long A[] = new long[N];
		long F[] = new long[N];
		for(int i = 0;i < N;i++) {
			A[i] = scn.nextLong();
		}
		for(int i = 0;i < N;i++) {
			F[i] = scn.nextLong();
		}
		Arrays.sort(A);
		Arrays.sort(F);
		System.out.println(searchAns(A,F,K));
	}

	public static boolean solve(long[] A,long[] F, long K, long ans) {//必要な引数を入れる
		long cnt = 0;
		long[] ideal = new long[A.length];
		for(int i = 0;i < A.length;i++) {
			ideal[i] = ans / F[i];
		}
		for(int i = 0;i < A.length;i++) {
			cnt += Math.max(A[A.length-i-1] - ideal[i], 0);
		}
		return K>=cnt;
	}
	public static long searchAns(long[] A, long[] F, long K) {//必要な引数を入れる
		long l = -1, r = 10000000000000L;
		while(r-l > 1) {
			long mid = (r+l)/2;
			if(solve(A,F,K,mid)) {//必要な引数を入れる
				r = mid;
			}else {
				l = mid;
			}
		}
		return r;
	}

}

