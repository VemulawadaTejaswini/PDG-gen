import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String O = sc.next();
		String E = sc.next();
		String [] stro = O.split("");
		String [] stre = E.split("");
		int odd = 0;
		int even = 0;

		for (int i = 0; i < O.length() + E.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(stro[odd]);
				odd++;
			} else {
				System.out.print(stre[even]);
				even++;
			}
		}
	}
}
