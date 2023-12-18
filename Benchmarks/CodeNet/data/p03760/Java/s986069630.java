import util.java.*;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[]$) {
		String[] a = new String[] {scanner.next(), scanner.next()};
		int length = a[0].length() + a[1].length();
		for (int i = 0; i < length; i++) {
			System.out.print(a[(i + 1) % 2].charAt(i / 2));
        }
		System.out.println();
	}
}