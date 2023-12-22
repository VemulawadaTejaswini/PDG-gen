import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		StringBuilder s = new StringBuilder(sc.next());
		System.out.println(s.reverse());
	}

	public static void main(String[] args) {
		new Main().run();
	}
}