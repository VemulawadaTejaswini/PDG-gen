import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		System.out.println((S.startsWith("YAKI"))? "Yes":"No");
		
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}