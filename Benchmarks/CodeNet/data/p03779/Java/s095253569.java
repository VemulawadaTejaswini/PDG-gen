import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int X = sc.nextInt();

		int pos = 0;
		int t = 0;
		while (true) {
			pos += t;
			if (pos >= X) {
				System.out.println(t);
				return;
			}
			t++;
		}
	}
}
