
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long s = sc.nextLong();

			System.out.println("0 1 " + s + " 0 0 0");
		}
	}
}