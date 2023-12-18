import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		int n1 = sc.nextInt();
		int nn1 = n1;
		int n2 = sc.nextInt();
		int nn2 = n2;

		int n;

		int count = 1;
		for (;;) {
			n = n1 / n2;
			n1 = n;
			if (n1 < n2) {
				break;
			}
			count++;
		}

		if (nn1 < nn2) {
			System.out.println(1);
		} else {
			System.out.println(count + 1);
		}
	}
}
