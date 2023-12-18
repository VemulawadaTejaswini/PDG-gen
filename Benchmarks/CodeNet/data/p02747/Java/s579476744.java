import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		boolean c = true;

		if (a.length() > 2) {
			for (int i = 0; i < a.length(); i += 2) {
				String b = a.substring(i, i + 2);
				if (!b.equals("hi")) c = false;
				break;
			}
		} else {
			if (!a.equals("hi"))c = false;
		}
		System.out.println(c ? "Yes" : "No");
	}
}