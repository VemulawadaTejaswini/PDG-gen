import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int X = sc.nextInt();
		final int Y = sc.nextInt();
		System.out.println((X+Y/2));
		sc.close();
	}
}
