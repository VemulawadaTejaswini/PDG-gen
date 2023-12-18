import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		IntStream.range(0, S.length()).forEach(i -> System.out.print("x"));
	}
}