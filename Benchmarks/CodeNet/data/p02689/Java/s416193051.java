import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] H = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		int[] T = new int[N];
		for (int i = 0; i < N; i++) {
			T[i] = 1;
		}
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			if (H[a] < H[b]) {
				T[a] = 0;
			} else if (H[a] > H[b]) {
				T[b] = 0;
			} else {
				T[a] = 0;
				T[b] = 0;
			}
		}
		int ans = 0;
		for (int t : T) {
			ans += t;
		}
		System.out.println(ans);
	}

}
