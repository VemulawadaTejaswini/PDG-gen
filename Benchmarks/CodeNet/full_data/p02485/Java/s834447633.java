import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			String x = in.nextLine();
			if ("0".equals(x)) {
				break;
			}
			int sum = 0;
			for (char c : x.toCharArray()) {
				sum += (int) (c - '0');
			}
			System.out.println(sum);
		}
	}
}