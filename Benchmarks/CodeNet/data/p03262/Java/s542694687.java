import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int offset = Integer.parseInt(scanner.nextLine().split(" ")[1]);
		System.out.println(
				Arrays.stream(scanner.nextLine().split(" "))
					.mapToInt(Integer::parseInt)
					.map(i -> i - offset)
					.map(Math::abs)
					.filter(i -> i != 0)
					.reduce((i1, i2) -> gcd(i1, i2))
					.getAsInt()
				);
	}
	public static int gcd(int i1, int i2) {
		int bg = i1 > i2 ? i1 : i2;
		int sm = i1 > i2 ? i2 : i1;
		int remainder = sm;
		while(bg % sm != 0) {
			remainder = bg % sm;
			bg = sm;
			sm = remainder;
		}
		return remainder;
	}
}