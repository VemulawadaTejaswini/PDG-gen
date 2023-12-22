import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String ss = s.substring(s.length() - 1, s.length());
		List<String> l1 = Arrays.asList("2", "4", "5", "7", "9");
		List<String> l2 = Arrays.asList("0", "1", "6", "8");

		if (l1.contains(ss)) {
			System.out.println("hon");
		} else if (l2.contains(ss)) {
			System.out.println("pon");
		} else {
			System.out.println("bon");
		}

		sc.close();
	}
}