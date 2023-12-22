import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String cards = sc.nextLine();
			if (cards.equals("-")) {
				break;
			}
			String[] cds = cards.split("");
			int cdlength = cards.length();
			String[] cds2 = new String[cdlength];
			int repeat = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < repeat; i++) {
				int shuffle = Integer.parseInt(sc.nextLine());
				if (i % 2 == 0) {
					for (int j = 0, k = shuffle; j < cdlength; j++, k++) {
						if (k == cdlength) {
							k  =0;
						}
						cds2[j] = cds[k];
					}
				} else {
					for (int j = 0, k = shuffle; j < cdlength; j++, k++) {
						if (k == cdlength) {
							k = 0;
						}
						cds[j] = cds2[k];
					}
				}
			}
			StringBuilder after = new StringBuilder();
			if (repeat % 2 == 0) {
				for (int i = 0; i < cdlength; i++) {
					after.append(cds[i]);
				}
			} else {
				for (int i = 0; i < cdlength; i++) {
					after.append(cds2[i]);
				}
			}
			System.out.println(after.toString());
		}
	}
}