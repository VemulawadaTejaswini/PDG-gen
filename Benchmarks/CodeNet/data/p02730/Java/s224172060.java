import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int size = s.length();
		int center = (size + 1) / 2;
		String head = s.substring(0, center - 1);
		String tail = s.substring(center);

		boolean answer = isKaibun(s) && isKaibun(head) && isKaibun(tail);

		printBool(answer);
	}

	public static boolean isKaibun(String s) {
		int size = s.length();
		int center = (size + 1) / 2;
		for (int i = 0; i < center; i++) {
			char head = s.charAt(i);
			char tail = s.charAt(s.length() - 1 - i);
			if (head != tail) {
				return false;
			}
		}
		return true;
	}

	public static void printBool(boolean bool) {
		print(bool ? "Yes" : "No");
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
