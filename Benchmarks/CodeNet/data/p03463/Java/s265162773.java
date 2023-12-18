import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		while (true) {
			if (A + 1 < B) {
				A++;
			} else {
				A--;
				if (A < 0) {
					System.out.println("Borys");
					break;
				}
			}
			if (B - 1 > A) {
				B--;
			} else {
				B++;
				if (B > N) {
					System.out.println("Alice");
					break;
				}
			}
		}
		sc.close();
	}
}