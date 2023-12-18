import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		int a = nextInt();
		int b = nextInt();
		int t = nextInt();
		System.out.println(t/a*b);
	}

	private int nextInt() {
		return Integer.parseInt(sc.next());
	}
}