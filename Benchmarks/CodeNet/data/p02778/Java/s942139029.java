import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s;
		int lengh;

		s = scanner.next();

		lengh = s.length();

		String ans = "";

		for (int i = 0; i < lengh; i++) {
			ans += "x";
		}

		System.out.println(ans);

	}

}