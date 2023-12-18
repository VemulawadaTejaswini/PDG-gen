import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str;
		char ch;
		int num;
		int len;

		num = scan.nextInt();
		str = scan.next();
		len = str.length();

		for(int i = 0; i < len; i++) {
			System.out.print((char)((str.charAt(i) - 'A' + num) % 26 + 'A'));
		}


	}
}
