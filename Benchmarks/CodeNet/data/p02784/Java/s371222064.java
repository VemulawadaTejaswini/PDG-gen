import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int n = scan.nextInt();
		int sum = IntStream.range(0, n).map(i -> scan.nextInt()).sum();

		System.out.println(sum >= h ? "Yes" : "No");
		scan.close();
	}
}