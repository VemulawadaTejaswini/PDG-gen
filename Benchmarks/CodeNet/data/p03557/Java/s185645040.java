import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int[]A, B, C;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new int[N];
		B = new int[N];
		C = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		long ans = 0;

		for(int i = 0; i < N; i++) {
			int k = B[i];
			int id1 = bs2(k, A);
			//System.out.println(id1);
			if(id1 != -1 && id1 != N) {
				int id2 = bs1(k, C);
				if(id1 != -1 && id2 != N) {
					ans += (long)(id1 + 1) * (N - id2);
				}
			}
		}
		System.out.println(ans);
	}
	// 条件を満たす最小の要素を返す
	static int bs1(int k, int[]G) {
		int l = -1;
		int r = N;
		while(r - l > 1) {
			int mid = (l + r) / 2;
			if(G[mid] > k) {
				r = mid;
			}else {
				l = mid;
			}
		}
		return r;
	}
	// 条件を満たす再際の要素を返す
	static int bs2(int k, int[]G) {
		int l = -1;
		int r = N;
		while(r - l > 1) {
			int mid = (l + r) / 2;
			if(G[mid] < k) {
				l = mid;
			}else {
				r = mid;
			}
		}
		return l;
	}
}