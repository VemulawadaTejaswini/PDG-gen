import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int k = scan.nextInt();
		String s = scan.next();

		if (k <= s.length()) {
			s =  s.substring(0 , k) + "...";
			System.out.println(s);
		}
		else {
			System.out.println(s);
		}

		scan.close();

	}

}
