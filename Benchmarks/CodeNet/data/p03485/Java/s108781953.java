import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Map<Integer, Integer> map = new LinkedHashMap<>();

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println((int) Math.ceil((double) (a + b) / 2));
	}

}
