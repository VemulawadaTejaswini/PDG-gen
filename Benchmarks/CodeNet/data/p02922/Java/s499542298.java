import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();

			int cnt = 0;
			while (B > 0 && A <= B) {
				B -= A;
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}