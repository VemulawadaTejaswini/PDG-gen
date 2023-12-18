import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextInt();
		long w = sc.nextInt();

		if (h * w % 2 == 0) {
			System.out.println(h * w / 2);
		} else {
			System.out.println(h * w / 2 + 1);
		}

		sc.close();
	}

}
