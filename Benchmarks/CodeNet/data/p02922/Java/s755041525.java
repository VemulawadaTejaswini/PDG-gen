import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int result = 0;
			if (A != 0) {
				result = B / A;
				if (B % A != 0) {
					result++;
				}
			}
			System.out.println(result);
		}
	}
}
