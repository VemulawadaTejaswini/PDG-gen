import java.io.IOException;
import java.util.Scanner;

public class Main extends Thread {
	final static Scanner sc = new Scanner(System.in);
	final static int first_range = sc.nextInt(), second_range = sc.nextInt();
	static int result = 0;
	final int a;

	public Main(int a) {
		this.a = a;
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		for (int a = 1; a < first_range; a++) {
			new Main(a).start();
		}
		final Main main = new Main(first_range);
		main.start();
		main.join();
		System.out.println(result);
		sc.close();
	}

	@Override
	public void run() {
		for (int b = 1; b <= first_range; b++) {
			if (a % b >= second_range) result++;
		}
	}
}
