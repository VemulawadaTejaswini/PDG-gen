import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int minA = A * 100 / 8;
		int minB = B * 10;

		int nextMinA = (A + 1) * 100 / 2;
		int nextMinB = (B + 1) * 10;

		boolean found = false;
		for(;minA <= nextMinA; minA++) {
			for(;minB <= nextMinB; minB++) {
				if (minA == minB) {
					found = true;
					break;
				}
			}

			if (found) {
				break;
			}
		}

		System.out.println(minA);
		sc.close();
	}
}