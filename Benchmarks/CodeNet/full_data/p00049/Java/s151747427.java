import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str[];
		int a, b, o, ab;

		a  = 0;
		b  = 0;
		o  = 0;
		ab = 0;
		while (sc.hasNext()) {
			str = sc.next().split(",");
			if (str[1].equals("A")) {
				a++;
			} else if (str[1].equals("B")) {
				b++;
			} else if (str[1].equals("O")) {
				o++;
			} else if (str[1].equals("AB")) {
				ab++;
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(ab);
		System.out.println(o);
	}
}