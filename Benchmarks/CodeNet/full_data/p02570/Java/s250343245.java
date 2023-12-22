import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt(), t = sc.nextInt(), s = sc.nextInt();

		if (s*t>=d) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
