import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String card = scan.next();
			if (card.equals("-")) break;
			int m = scan.nextInt();
			for (int i = 0; i < m; i++) {
				int h = scan.nextInt();
				String str = card.substring(0, h);
				card = card.substring(h, card.length());
				card = card + str;
			}
			System.out.println(card);
		}
		
	}
	public static void main(String[] args) {
		new Main().run();
	}
}