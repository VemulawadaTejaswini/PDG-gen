import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong();
		String result = new String();
		while(number > 0) {
			int nums = (int)('a' + (number % 26 - 1));
			char temporal = (char) nums;
			result = temporal + result;
			number /= 26;
		}
		System.out.print(result);
	}
}
