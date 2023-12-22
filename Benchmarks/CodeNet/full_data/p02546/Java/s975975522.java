import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String ans = null;
		if (s.endsWith("s")) {
			ans = s + "es";
		} else {
			ans = s + "s";
		}

		System.out.println(ans);

	}
}
