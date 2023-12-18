import java.util.Scanner;

//AtCoder Beginner Contest 159
//D - Banned K
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A[] = new int[N];
		int C[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
			C[A[i]-1]++;
		}
		sc.close();

		for (int i = 0; i < N; i++) {
			int ans = 0;
			for (int j = 0; j < N; j++) {
				if (A[i]-1!=j) {
					if (C[j] > 1) {
						ans += combination(C[j], 2);
					}
				} else {
					ans += combination(C[j] - 1, 2);
				}
			}
			System.out.println(ans);
		}
	};

	static int combination(int p, int n) {
		int minn = Math.min(p,n);
		int ans = 1;
		for (; n < p; p--) {
			ans *= p;
		}
		for (int i = 1; i <= minn; i++) {
			ans /= i;
		}
		return ans;
	}
}
