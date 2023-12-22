import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		char[] str_char = new char[3];
		for (int i = 0; i < 3; i++) {
			str_char[i] = string.charAt(i);
		}

		if (str_char[1] == 'B') {
			str_char[1] = 'R';
		} else {
			str_char[1] = 'B';
		}

		System.out.println(str_char);
	}
}