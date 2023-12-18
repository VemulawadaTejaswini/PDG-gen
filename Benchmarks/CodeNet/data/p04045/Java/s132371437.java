import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int payment = Integer.parseInt(scanner.nextLine().split(" ")[0]);
		List<String> dislikes = Arrays.stream(scanner.nextLine().split(" ")).sorted().collect(Collectors.toList());

		while(!isAcceptable(payment, dislikes)) {
			payment++;
		}

		System.out.println(payment);
	}

	private static boolean isAcceptable(int payment, List<String> dislikes) {
		return !Arrays.stream(Integer.toString(payment).split("")).anyMatch(dislikes::contains);
	}
}
