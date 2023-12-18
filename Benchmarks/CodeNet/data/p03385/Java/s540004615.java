import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		char[] a = new char[3];

		for (int i = 0; i < 3; i++) {
			a[i] = s.charAt(i);
		}
		if (Arrays.asList(a).contains('a') && Arrays.asList(a).contains('b') && Arrays.asList(a).contains('c')) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}