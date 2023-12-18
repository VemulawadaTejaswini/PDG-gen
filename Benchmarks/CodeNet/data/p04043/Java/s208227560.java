import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count5 = 0;
		int count7 = 0;
		for (int i = 0; i < 3; i++) {
			int n = sc.nextInt();
			if (n == 5) count5++;
			if (n == 7) count7++;
		}
		sc.close();

		if (count5 == 1 && count7 == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
