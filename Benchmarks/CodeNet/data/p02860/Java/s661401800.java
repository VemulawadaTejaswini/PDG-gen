import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		String t = s.substring(0, n / 2);

		if ((t + t).equals(s)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}