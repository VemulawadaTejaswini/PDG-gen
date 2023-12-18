import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int n = 0;
		int i = 0;
		while (true) {
			n = A + (A - 1) * i;
			if (B <= n) {
				break;
			}
			i++;

		}

		System.out.println(i + 1);
		sc.close();

	}
}
