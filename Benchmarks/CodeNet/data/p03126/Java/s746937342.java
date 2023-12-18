import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
	static int M = Integer.parseInt(sc.next());
	static int[] likes = new int[M+1];
	public static void main(String[] args) {
		for (int i = 0; i < N; i++) {
			int K = Integer.parseInt(sc.next());
			for (int k = 0; k < K; k++) {
				int index = Integer.parseInt(sc.next());
				likes[index]++;
			}
		}
		int ans = 0;
		for (int i = 0; i <= M; i++) {
			if (likes[i] == N) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
