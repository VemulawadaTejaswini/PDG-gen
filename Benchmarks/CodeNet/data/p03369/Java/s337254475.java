import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(700 + scanner.next().chars().filter(i -> (char) i == 'o').count() * 100);
		}
	}
}
