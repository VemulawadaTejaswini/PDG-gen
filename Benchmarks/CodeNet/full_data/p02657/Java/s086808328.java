import java.util.Scanner;

public class Main {
	public void main(Scanner sc) {
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a * b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new Main().main(sc);
	}
}
