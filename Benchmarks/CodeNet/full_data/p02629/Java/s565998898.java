import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();
			long number = Long.parseLong(data);

			StringBuilder sb = new StringBuilder();
			List<Long> amarilist = new ArrayList<Long>();
			long sho = 0L;
			long amari = 0L;

			while(true) {
				sho = number / 26;
				amari = number % 26;

				if (sho == 0 && amari == 0) {
					amarilist.add(amari);
					break;
				} else if (sho == 0 && amari != 0) {
					amarilist.add(amari);
					break;
				} else if (sho < 26 && amari == 0) {
					amarilist.add(amari);
					break;
				} else if (sho < 26 && amari != 0) {
					amarilist.add(amari);
					number = sho;
				} else {
					amarilist.add(amari);
					number = sho;
				}
			}

			Collections.reverse(amarilist);


			for (int i = 0; i < amarilist.size(); i++) {
				String moji = getMoji(amarilist.get(i).intValue());
				sb.append(moji);
			}

			System.out.println(sb.toString());
		}
	}

	private static final String mojiretu = "abcdefghijklmnopqrstuvwxyz";

	private static String getMoji(int index) {
		if (index == 0) {
			return "z";
		}
		return mojiretu.substring(index - 1, index);
	}
}