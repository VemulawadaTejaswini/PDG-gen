import java.util.Scanner;

public class Main {

	static char[][] ch_tb = new char[][] {    {'a', 'b', 'c', 'd', 'e' },
												{'f', 'g', 'h', 'i', 'j' },
												{'k', 'l', 'm', 'n', 'o' },
												{'p', 'q', 'r', 's', 't' },
												{'u', 'v', 'w', 'x', 'y' },
												{'z', '.', '?', '!', ' ' }
										 	};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			do {
				String str = sc.nextLine();
					if (str.length() % 2 > 0) {
						System.out.println("NA");
					} else {
						convert(str);
					}
			}while(sc.hasNext());
		sc.close();

	}
	private static void convert(String str) {
		StringBuilder sb = new StringBuilder();

			for (int i = 0; i < str.length() / 2; i++) {
				int x = str.charAt(2 * i) - '1';
				int y = str.charAt(2 * i + 1) - '1';

				sb.append(ch_tb[x][y]);
			}
		System.out.println(sb.toString());

	}

}
