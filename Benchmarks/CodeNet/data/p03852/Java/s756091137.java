import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String c = scanner.next();
		String[] array = {"a", "i", "u", "e", "o"};
		String result = "consonant";

		if (Arrays.asList(array).contains(c)) {
			result = "vowel";
		}
		System.out.println(result);
	}

}