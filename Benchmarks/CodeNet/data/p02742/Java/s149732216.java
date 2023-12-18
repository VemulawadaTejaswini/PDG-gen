import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToLong(Long::parseLong).toArray();
		long ans = 0;

		if (line[0] == 1 || line[1] == 1) {
			ans += 1;
		} else {
			ans += line[0] / 2 * line[1];
			if (line[0] % 2 == 1) {
				ans += line[1] / 2 + 1;
			}
		}

		 System.out.println(ans);
	}
}
