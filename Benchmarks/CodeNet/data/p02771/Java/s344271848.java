import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(line);
		if (line[1] == line[0] || line[1] == line[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}