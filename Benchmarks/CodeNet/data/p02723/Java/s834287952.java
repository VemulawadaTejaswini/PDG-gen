
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean ans = true;
		ans = ans && (s.charAt(2) == s.charAt(3));
		ans = ans && (s.charAt(4) == s.charAt(5));
		System.out.println(ans ? "Yes" : "No");

	}

}
