import java.util.Scanner;

public class Main {
	private long a = 1;

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = n; i > 0; i--) {
			a *= i;
		}
		System.out.println(a);
	}
	
	private void debug() {
		System.out.println();
	}

}