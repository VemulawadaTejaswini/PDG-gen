import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int inA = 0, inB = 0;

		try {
			String[] s = scanner.nextLine().split(" ");
			inA = Integer.parseInt(s[0]);
			inB = Integer.parseInt(s[1]);
		} catch (NumberFormatException e) {
		} catch (NullPointerException e) {
		}

		scanner.close();

		if (inA >= 13) {
			System.out.println(inB);
		} else if (12 >= inA && inA >= 6) {
			System.out.println(inB / 2);
		} else {
			System.out.println(0);
		}

	}

}
