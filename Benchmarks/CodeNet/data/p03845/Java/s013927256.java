import java.util.Scanner;

public class Main {
	int N,M,P,X,ans;
	int sum = 0;
	int[] T;

	void run() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		T = new int[N+1];
		for(int i = 1; i <= N; i++) {
			T[i] = sc.nextInt();
			sum += T[i];
		}
		M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			P = sc.nextInt();
			X = sc.nextInt();
			ans = sum - (T[P] - X);
			System.out.println(ans);
		}
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}