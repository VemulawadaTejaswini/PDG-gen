import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			double d = scan.nextInt();
			int s = 0;
			for (int i = 0; i < 600; i += d) {
				s += i * i * d;
			}
			System.out.println(s);
		}
	}
	
	private void debug() {
		System.out.println();
	}

}