import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int minA = A * 25 / 2;
		int minB = B * 10;

		int nextMinA = (A + 1) * 25 / 2;
		int nextMinB = (B + 1) * 10;

		int result = -1;
		root : for(;minA <= nextMinA; minA++) {
			for(;minB <= nextMinB; minB++) {
				if (minA == minB) {
					result = minA;
					break root;
				}
			}

		}

		System.out.println(result);
		sc.close();
	}
}