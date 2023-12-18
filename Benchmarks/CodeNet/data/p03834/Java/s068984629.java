import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		s = s.replace(',', ' ');
		System.out.println(s);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
