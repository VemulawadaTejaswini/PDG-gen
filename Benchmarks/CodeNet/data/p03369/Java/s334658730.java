import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char a[] = new char[3];
		String str = "";
		int price = 700;

		str = scan.next();

		for (int m=0; m<a.length; m++) {
			a[m] = str.charAt(m);
			if (a[m] == '〇') {
				price += 100;
			}
		}

		System.out.println(price);

		scan.close();

	}

}
