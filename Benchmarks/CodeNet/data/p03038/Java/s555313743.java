import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = scn.nextLong();
		}

		for (int i = 0; i < M; i++) {
			Arrays.sort(A);
			int B = scn.nextInt();
			long C = scn.nextLong();

			if (A[B - 1] <= C) {
				Arrays.fill(A, 0, B, C);
			} else {
				int l = 0;
				int r = B;
				int mid = 0;
				while (r - l > 1) {
					mid = (l+r)/2;
					if(A[mid] < C) {
						l = mid;
					}else if(A[mid] > C) {
						r = mid;
					}else {
						l = mid;
						break;
					}
				}
				Arrays.fill(A, 0, l, C);

			}
		}
		long ans = 0;
		for(int i = 0;i < N;i++) {
			ans += A[i];

		}
		System.out.println(ans);
	}

}