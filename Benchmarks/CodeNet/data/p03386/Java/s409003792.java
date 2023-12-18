
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();

		boolean isPrint[] = new boolean[b + 1];

		if (k > (b - a)) {
			k = (b - a);
		}

		for (int i = a; i < (a + k); i++) {
			isPrint[i] = true;
		}

		for (int i = b - k + 1; i <= b; i++) {
			isPrint[i] = true;
		}

		for (int i = a; i <= b; i++) {
			if (isPrint[i])
				System.out.println(i);
		}
	}

}
