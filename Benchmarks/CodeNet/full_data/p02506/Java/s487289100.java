

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sb = null;
		String find = scan.nextLine();
		while (true) {
			String str = scan.nextLine();
			if (str.equals("END_OF_TEXT")) {
				break;
			}
			sb = sb + str;
		}
		String[] sss = sb.split(find);
		int count = sss.length - 1;
		System.out.println(count);
	}
}