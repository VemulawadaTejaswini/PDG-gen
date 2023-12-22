import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {

			String cards = scan.next();

			if (cards.equals("-")) {
				break;
			}
			//System.out.println("cards = " + cards);

			int m = scan.nextInt();
			//System.out.println("m = " + m);

			for (int i = 0; i < m; i++) {
				int h = scan.nextInt();
				//System.out.println("h = " + h);

				cards = (cards.substring(h) + cards.substring(0, h));
				//System.out.println(cards);
			}

			sb.append(cards + "\n");
		}
		System.out.print(sb);
	}
}