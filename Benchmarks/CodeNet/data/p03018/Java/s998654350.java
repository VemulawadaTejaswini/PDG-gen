
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			String TARGET = "ABC";
			String CHANGE = "BCA";

			String before = sc.next();
			String after = "";
			int count = 0;
			do {
				after = before.replaceFirst(TARGET, CHANGE);
				if (!before.equals(after)) {
					count++;
				} else {
					break;
				}
				before = after;
			} while(true);

			System.out.println(count);
		}
	}
}
