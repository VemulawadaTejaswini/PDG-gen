import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			new Main().exec(sc);
		}
	}

	public void exec(Scanner sc) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		result = Integer.toString(n, k).length();
		System.out.println(result);
	}
}
