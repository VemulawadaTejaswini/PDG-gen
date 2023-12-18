import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if (n % 3 != 0 && n % 4 != 0) {
			System.out.println(-1);
		} else {
			throw new RuntimeException();
		}
	}
}
