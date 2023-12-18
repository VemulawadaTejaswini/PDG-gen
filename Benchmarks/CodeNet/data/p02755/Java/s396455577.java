import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		Double aa = a / 0.08;
		Double bb = b / 0.10;

		Integer i = aa.intValue();
		Integer j = bb.intValue();

		if (i == j) {
			System.out.println(i);
		} else if (i + 1 == j) {
			System.out.println(i + 1);
		} else if (i == j + 1) {
			System.out.println(i + 1);
		} else {
			System.out.println("-1");
		}

		sc.close();
	}

}
