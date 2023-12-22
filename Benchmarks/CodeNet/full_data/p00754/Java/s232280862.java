import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char stack[] = new char[10000];
		String data;
		int sp;
		int match;

		Scanner sc = new Scanner(System.in);
		while (true) {
			data = sc.next();
			if (data.equals(".")) {
				break;
			}
			match = -1;
			sp = 0;
			for (int i = 0;; ++i) {
				if (data.charAt(i) == '(' || data.charAt(i) == '[') {
					stack[sp] = data.charAt(i);
					++sp;
				} else if (data.charAt(i) == ')') {
					if (sp == 0) {
						match = 0;
					} else {
						--sp;
						if (stack[sp] != '(') {
							match = 0;
						}
					}
				} else if (data.charAt(i) == ']') {
					if (sp == 0) {
						match = 0;
					} else {
						--sp;
						if (stack[sp] != '[') {
							match = 0;
						}
					}
				} else if (data.charAt(i) == '.') {
					if (sp == 0) {
						match = 1;
					} else {
						match = 0;
					}
				}
				if (match != -1) {
					break;
				}
			}
			if (match == 1) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		sc.close();
	}

}

