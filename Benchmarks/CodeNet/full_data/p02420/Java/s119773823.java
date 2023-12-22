import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			String cards = scan.nextLine();
			if ( cards.equals("-") ) {break;}

			int m = scan.nextInt();

			for (int i = 0; i < m; i++) {
				int h = scan.nextInt();
				cards = cards.substring(h) + cards.substring(0, h);
			}
			sb.append(cards + "\n");
		}
		System.out.print(sb);
	}
}