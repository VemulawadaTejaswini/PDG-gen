import java.util.Objects;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for (int i = 2, f = s.length(); i <= f; ++i) {
			if (Objects.equals(s.substring(i - 2, i), "AC")) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}

}
