import java.util.Scanner;

public class Main {
	private static final int SIZE = 'z' - 'a' + 1;

	public static boolean check(char[] c) {
		for(int i = 0; i < SIZE; i++) {
			if(c[i] % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();

		char[] count = new char[SIZE];
		for(int i = 0; i < c.length; i++) {
			count[c[i] - 'a']++;
		}

		for(int i = c.length - 1; i >= 0; i--) {
			int index = c[i] - 'a';
			count[index]--;
			if(check(count)) {
				System.out.println(i);
				return;
			}
		}
	}
}
