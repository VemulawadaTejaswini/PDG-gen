import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		ArrayList<String[]> all = new ArrayList<String[]>();

		String line = "";

		int pat = 0;

		while (true) {
			line = sc.nextLine();
			if (line.equals("-")) {
				break;
			}

			String shuffle = sc.nextLine();
			int shuffle_int = Integer.parseInt(shuffle);

			String[] kari = new String[2 + shuffle_int];
			kari[0] = line;
			kari[1] = shuffle;

			for (int j = 0; j < shuffle_int; j++) {
				kari[2 + j] = sc.nextLine();
			}
			all.add(kari);
			pat++;
		}

		for (int i = 0; i < pat; i++) {
			String[] s = all.get(i);
			String str = s[0];
			int repeat = Integer.parseInt(s[1]);
			for (int j = 0; j < repeat; j++) {
				int sh = Integer.parseInt(s[j + 2]);
				String a = str.substring(0, sh);
				String b = str.substring(sh);
				str = b + a;
			}
			System.out.println(str);
		}

	}

}