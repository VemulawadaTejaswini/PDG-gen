import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int num = 1;

		for (int i = 1; true; i++) {
			for (int j = num; a * i >= b * j; j++) {
				num = j;
				if (a * i == b * j) {
					System.out.println(a * i);
					return;
				}
			}

		}

	}
}
