import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (IntStream.rangeClosed(1, 9).anyMatch(num -> (n % num == 0) && (n / num < 10))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
