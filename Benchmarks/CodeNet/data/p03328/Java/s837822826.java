import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println((b-a)*(b-a+1)/2-b);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}
