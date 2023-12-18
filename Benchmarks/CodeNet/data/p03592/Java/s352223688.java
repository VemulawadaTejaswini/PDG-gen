import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int K = in.nextInt();
		boolean ans = false;
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= M; j++) {
				if(M*i+N*j-2*i*j == K) ans = true;
			}
		}
		System.out.println(ans? "Yes":"No");
		
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}