

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		ArrayList<String> list = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String in = scan.nextLine();
			list.add(in);
		}
		scan.close();

		for (String str : list) {
			String[] split = str.split(" ");
			long a = Long.valueOf(split[0]);
			long b = Long.valueOf(split[1]);

			String s = String.valueOf(a + b);

			System.out.println(s.length());
		}

	}
}

