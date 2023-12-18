import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len =Integer.parseInt(sc.nextLine());
		double[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToDouble(Double::parseDouble).toArray();
		Arrays.sort(line);
		double ans = line[0];
		for (int i = 1; i < len; i++) {
			ans = (ans + line[i]) / 2;
		}

		System.out.println(ans);
	}
}
