import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		boolean result = true;
		if (s.equals("AAA") || s.equals("BBB")) {
			result = false;
		}
		printBool(result);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static void printBool(boolean bool) {
		print(bool ? "Yes" : "No");
	}

}
