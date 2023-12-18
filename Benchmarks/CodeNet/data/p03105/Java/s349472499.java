import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		int result = 0;
		if(A*C < B) {
			result = C;
		}else {
			result = B/A;
		}
		System.out.println(result);
	}
}