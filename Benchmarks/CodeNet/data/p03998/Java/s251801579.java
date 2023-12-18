import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		String nextTern = "a";
		while (a.length() > 0 || b.length() > 0 || c.length() > 0) {
			if (nextTern.equals("a")) {
				if (a.length() == 0) {
					System.out.println("A");
					break;
				}
				nextTern = a.substring(0, 1);
				if (a.length() > 1) {
					a = a.substring(1);
				} else {
					a = "";
				}

			} else if (nextTern.equals("b")) {
				if (b.length() == 0) {
					System.out.println("B");
					break;
				}
				nextTern = b.substring(0, 1);
				if (b.length() > 1) {
					b = b.substring(1);
				} else {
					b = "";
				}
			} else {
				if (c.length() == 0) {
					System.out.println("C");
					break;
				}
				nextTern = c.substring(0, 1);
				if (c.length() > 1) {
					c = c.substring(1);
				} else {
					c = "";
				}
			}
		}

	}

}