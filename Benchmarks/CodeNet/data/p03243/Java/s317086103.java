import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] n = scanner.next().toCharArray();
			char max = (char) IntStream.range(0, n.length).map(i -> n[i]).max().getAsInt();
			IntStream.range(0, n.length).forEach(i -> n[i] = max);
			System.out.println(n);
		}
	}
}
