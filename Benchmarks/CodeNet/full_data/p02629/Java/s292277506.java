import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Long> alphaList = new ArrayList<>();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();

		long count = 0;

		for (int i = 1; true; i++) {

			count += Math.pow(26, i);

			if (n <= count) {
				caliculate(i, n);
				break;
			}
		}

		String[] alphaArray = "abcdefghijklmnopqrstuvwxyz".split("");

		StringBuilder builder = new StringBuilder();

		for (long number : alphaList) {

			builder.append(alphaArray[(int) number - 1]);
		}

		println(builder.toString());
	}

	public static void caliculate(int i, long count) {

		if (i == 1) {

			alphaList.add(count);

		} else {

			long number = (long) (count / Math.pow(26, i - 1));

			if (number == 27) {

				alphaList.add(number - 1);
				caliculate(i - 1, (long) (Math.pow(26, i - 1)));

			} else {

				alphaList.add(number);
				caliculate(i - 1, (long) (count % Math.pow(26, i - 1)));
			}
		}
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
