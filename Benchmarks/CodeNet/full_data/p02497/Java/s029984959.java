import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if (m == -1 && f == -1 && r == -1) break;
			if (m == -1 || f == -1) {
				System.out.println("F");
				continue;
			}
			int sum = m + f;
			System.out.println(sum >= 80 ? "A" : sum >= 65 ? "B" :
							   sum >= 50 || (30 <= sum && sum <= 50 && r >= 50) ? "C" :
							   sum >= 30 ? "D" : "F");
		}

	}

}