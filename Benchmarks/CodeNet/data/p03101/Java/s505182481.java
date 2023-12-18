import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		sc.close();
		long hw = (H-h)*(W-w);

		System.out.println(hw);
	}

}
