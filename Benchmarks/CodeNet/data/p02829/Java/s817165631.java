import java.util.*;

public class Main {
	public static void main(String[] args) {
		// practice contest

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == 1 && b == 2) {
			System.out.println(3);
		} else if (a == 1 && b == 3) {
			System.out.println(2);
		} else if (a == 2 && b == 3) {
			System.out.println(1);
		} else if (a == 2 && b == 1) {
			System.out.println(3);
		} else if (a == 3 && b == 1) {
			System.out.println(2);
		} else if (a == 3 && b == 2) {
			System.out.println(1);
		} else if (b == 1 && a == 2) {
			System.out.println(3);
		} else if (b == 1 && a == 3) {
			System.out.println(2);
		} else if (b == 2 && a == 3) {
			System.out.println(1);
		} else if (b == 2 && a == 1) {
			System.out.println(3);
		} else if (b == 3 && a == 1) {
			System.out.println(2);
		} else if (b == 3 && a == 2) {
			System.out.println(1);
		}

	}
}