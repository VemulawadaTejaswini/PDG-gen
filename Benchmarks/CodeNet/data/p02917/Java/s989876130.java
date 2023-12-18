import java.util.Scanner;

public class Main {
	
	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int current = in.nextInt();
		int total = current; //1st
		int prev = current;
		for (int i = 1; i < N-1; i++) {
			current = in.nextInt();
			total += Math.min(prev, current);
			prev = current;
		}
		total += prev; //last
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
