import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		String line;
		String[] cards;
		while (sc.hasNext() == true) {
			line = sc.nextLine();
			
			cards = line.split(",");
			Arrays.sort(cards);
			
			int pre = 0;
			boolean straight = false;
			
			int[] point = new int[14];
			for (int i = 0; i < cards.length; i++) {
				int tmp = Integer.parseInt(cards[i]);
				point[tmp]++;
				
				if (pre != 0) {
					if ((pre + 1) != tmp) {
						if ((pre != 1) || (tmp != 10)) straight = false;
					}
				}
				pre = tmp;
			}
			
			int[] judge = new int[5];
			for (int i = 0; i < point.length; i++) {
				judge[point[i]]++;
			}
			
			if (judge[4] == 1) {
				System.out.println("four card");
			} else if ((judge[2] == 1) && (judge[3] == 1)) {
				System.out.println("full house");
			} else if (judge[1] == 5) {
				if (straight == true) System.out.println("full house");
				else System.out.println("null");
			} else if (judge[3] == 1) {
				System.out.println("three card");
			} else if (judge[2] == 2) {
				System.out.println("two pair");
			} else if (judge[2] == 1) {
				System.out.println("one pair");
			} else {
				System.out.println("null");
			}
		}
	}
}