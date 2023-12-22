import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int ans = 0;
		for (int i = line[0]; i <= line[1]; i++) {
			if (i % line[2] == 0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}