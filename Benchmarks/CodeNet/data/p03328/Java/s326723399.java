import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		int A = 0;
		int B = 0;

		int gap = b-a;

		for (int i = 1; i <= gap - 1; i ++) {
			A = A + i;
		}

		System.out.println(A - a);

	}
}