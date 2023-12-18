import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();

		int num = Integer.parseInt(N);

		if (num <= 81) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}