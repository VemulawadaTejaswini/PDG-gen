import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			int count = 0;
			while (true) {
				int zeroOne = S.lastIndexOf("01");
				int oneZero = S.lastIndexOf("10");
				int index = Math.max(oneZero, zeroOne);
				if (index == -1) {
					break;
				}
				count += 2;
				S = S.substring(0, index) + S.substring(index + 2);
			}
			System.out.println(count);
		} // Scanner Close
	}
}