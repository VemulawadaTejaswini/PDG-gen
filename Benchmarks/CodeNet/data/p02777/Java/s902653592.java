import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		int A = sc.nextInt();
		int B = sc.nextInt();

		String u = sc.next();

		if (u.equals(s)) {
			System.out.println((A - 1) + " " + B);
		} else {
			System.out.println(A + " " + (B - 1));
		}

		sc.close();
	}

}
