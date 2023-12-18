import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());

		int b = Integer.parseInt(sc.next());

		int result = 0;

		int i = 0;
		for (i = 0; a > result; i++) {

			result += i;
		}

		if (result - a > 1) {
			System.out.println(result - a);
		} else {
			System.out.println(1);
		}
	}

}
