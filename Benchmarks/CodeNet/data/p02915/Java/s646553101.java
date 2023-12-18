import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println((int)Math.pow(N, 3));
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}