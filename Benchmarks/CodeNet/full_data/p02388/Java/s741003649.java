import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		System.out.println(x*x*x);
		scn.close();
	}

}