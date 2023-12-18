import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char a[] = new char[3];
		String str = "";
		int price = 700;

		str = scan.next();

		for (int i=0; i<str.length; i++) {
			if (str.charAt(m) == '〇') {
				price += 100;
			}
		}

		System.out.println(price);

		scan.close();

	}

}
