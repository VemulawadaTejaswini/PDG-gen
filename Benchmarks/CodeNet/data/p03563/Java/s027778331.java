import java.util.Scanner;

public class Main {
	int r, g;

	public static void main(String[] args) {
		Main a = new Main();
		a.read();
		a.solve();
	}

	public void read() {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		g = sc.nextInt();
	}

	public void solve() {
		int target = 0;
		target = 2*g - r;
		System.out.println(target);
	}
}
