import java.util.Scanner;

public class Main {
	public void run() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int right = 0, left = 0;
		for (int i = 0; i < n; i++) {
			long x = in.nextInt();
			char c = in.next().charAt(0);
			long a = in.nextInt();
			if (c == '(') left += a;
			else right += a;
			System.out.println((right == left) ? "YES" : "NO");
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

}