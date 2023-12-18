import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int total = 0;

		if (str.charAt(0) == '1') total++;
		if (str.charAt(1) == '1') total++;
		if (str.charAt(2) == '1') total++;
	}
}