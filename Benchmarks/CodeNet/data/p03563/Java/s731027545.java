import java.util.Scanner;

public class ABC076A_RatingGoal {
	int r, g;

	public static void main(String[] args) {
		ABC076A_RatingGoal a = new ABC076A_RatingGoal();
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
