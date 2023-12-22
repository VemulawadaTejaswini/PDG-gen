import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[][] encode = new String[][] { { "11", "a" }, { "12", "b" },
				{ "13", "c" }, { "14", "d" }, { "15", "e" }, { "21", "f" },
				{ "22", "g" }, { "23", "h" }, { "24", "i" }, { "25", "j" },
				{ "31", "k" }, { "32", "l" }, { "33", "m" }, { "34", "n" },
				{ "35", "o" }, { "41", "p" }, { "42", "q" }, { "43", "r" },
				{ "44", "s" }, { "45", "t" }, { "51", "u" }, { "52", "v" },
				{ "53", "w" }, { "54", "x" }, { "55", "y" }, { "61", "z" },
				{ "62", "." }, { "63", "?" }, { "64", "!" }, { "65", " " }, };
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String in = sc.nextLine();
			if (in.length() % 2 == 1) {
				System.out.println("NA");
			} else {
				int index = 0, i = 0;
				StringBuilder sb = new StringBuilder();
				while (index < in.length()) {
					String enc = in.substring(index, index + 2).replace(
							encode[i][0], encode[i][1]);
					if (enc.length() == 1) {
						i = 0;
						sb.append(enc);
						index += 2;
					} else {
						if (i + 1 < encode.length) {
							i++;
						} else {
							System.out.println("NA");
							System.exit(0);
						}
					}
				}
				System.out.println(sb.toString());
			}
		}
	}
}