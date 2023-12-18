import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		Scanner sc = new Scanner(System.in);
		final String s = sc.next();
		final int N = s.length();

		final char BLACK = 'B';
		final char WHITE = 'W';
		int wth = 0;
		long ops = 0;
		for (int i = 0; i < N; i++) {
			if (s.charAt(i) == WHITE) {
				ops += i - wth;
				wth++;
			}
		}
		
		System.out.println(ops);
		sc.close();
	}
}
