
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			String tmp = Long.toString(n);
			int sn = 0;
			for (char c : tmp.toCharArray()) {
				sn += c - '0';
			}
			if (n % sn == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
