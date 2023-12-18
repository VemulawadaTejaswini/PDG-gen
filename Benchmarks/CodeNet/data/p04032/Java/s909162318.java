import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();

		Sub sub = new Sub();

		sub.test(str.length(), str, 'a');
		sub.test(str.length(), str, 'b');
		sub.test(str.length(), str, 'c');
		sub.test(str.length(), str, 'd');
		sub.test(str.length(), str, 'e');
		sub.test(str.length(), str, 'f');
		sub.test(str.length(), str, 'g');
		sub.test(str.length(), str, 'h');
		sub.test(str.length(), str, 'i');
		sub.test(str.length(), str, 'j');
		sub.test(str.length(), str, 'k');
		sub.test(str.length(), str, 'l');
		sub.test(str.length(), str, 'm');
		sub.test(str.length(), str, 'n');
		sub.test(str.length(), str, 'o');
		sub.test(str.length(), str, 'p');
		sub.test(str.length(), str, 'q');
		sub.test(str.length(), str, 'r');
		sub.test(str.length(), str, 's');
		sub.test(str.length(), str, 't');
		sub.test(str.length(), str, 'u');
		sub.test(str.length(), str, 'v');
		sub.test(str.length(), str, 'w');
		sub.test(str.length(), str, 'x');
		sub.test(str.length(), str, 'y');
		sub.test(str.length(), str, 'z');

		System.out.println("-1 -1");
	}
}

class Sub {
	void test(int strlen, String str, char chr) {
		int count = 0;
		int x = -1;
		int y = -1;
		for (int i = 0; i < strlen; i++) {
			if (str.charAt(i) == chr) {
				if (x == -1) {
					x = i;
					count++;
				} else {
					y = i;
					count++;
					if ((double) count * 2.0 / (y - x) >= 1) {
						System.out.println(x+1 + " " + y+1);
						System.exit(1);
					}
				}
			}
		}
	}
}