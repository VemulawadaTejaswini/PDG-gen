import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String s = scan.next();
	char[] c = new char[s.length()];
	for (int i = 0; i < s.length(); i++) {
		c[i] = s.charAt(i);
	}
	for (int i = 0; i < 3; i++) {
		if (c[i] == '1') {
			c[i] = '9';
		} else {
			c[i] = '1';
		}
	}
	for (int i = 0; i < 3; i++) {
		System.out.print(c[i]);
	}
	}
}
