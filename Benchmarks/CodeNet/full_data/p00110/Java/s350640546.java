import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String fm[] = sc.nextLine().split("\\+|=");
			int init = 0;
			if (fm[0].charAt(0) == 'X' && fm[0].length() > 1
					|| fm[1].charAt(0) == 'X' && fm[1].length() > 1
					|| fm[2].charAt(0) == 'X' && fm[2].length() > 1) {
				init = 1;
			}
			for (int i = init; i < 10; i++) {
				if (Integer.parseInt(fm[0].replace('X', (char) (i + '0')))
						+ Integer
								.parseInt(fm[1].replace('X', (char) (i + '0'))) == Integer
							.parseInt(fm[2].replace('X', (char) (i + '0')))) {
					System.out.println(i);
					break;
				}
				if (i == 9)
					System.out.println("NA");
			}
		}
	}
}