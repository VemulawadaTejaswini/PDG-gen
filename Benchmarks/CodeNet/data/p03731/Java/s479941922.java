import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] t = new int[N];
		for(int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
		}
		int ans = T;
		for(int i = 1; i < N; i++) {
			if(t[i]-t[i-1] < T) {
				ans += T - (T - (t[i] - t[i-1]));
			}else {
				ans += T;
			}
		}
		System.out.println(ans);
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}