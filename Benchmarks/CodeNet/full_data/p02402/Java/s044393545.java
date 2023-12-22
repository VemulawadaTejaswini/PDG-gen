import java.util.Scanner;

public class ITP1_4_D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();

		int count = Integer.parseInt(line1);

		String[] num = line2.split(" ");

		int n = Integer.parseInt(num[0]);
		int m = Integer.parseInt(num[0]);

		int result = 0;

		for (int i = 0; i < count; i++) {

			if (m > Integer.parseInt(num[i])) {
				m = Integer.parseInt(num[i]);
			}
			if (n < Integer.parseInt(num[i])) {
				n = Integer.parseInt(num[i]);
			}

			result += Integer.parseInt(num[i]);
		}
		System.out.println(m + " " + n + " " + result);
	}
}

