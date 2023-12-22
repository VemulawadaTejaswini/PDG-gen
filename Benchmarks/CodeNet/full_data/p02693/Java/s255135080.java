import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;

		for (int i = a; i <= b; i++) {
			if (i % K == 0) {
				count++;
			}
		}

		if (count > 0) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}

	}

}