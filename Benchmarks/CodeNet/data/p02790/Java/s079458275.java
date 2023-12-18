import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a < b) {
			repeat(a, b);
		}else {
			repeat(b, a);
		}

	}

	private static void repeat(int a, int b) {
		for (int i = 0; i < b; i++) {
			System.out.print(a);
		}
	}

}
