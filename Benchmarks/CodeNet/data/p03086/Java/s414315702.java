import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		ArrayList<String> list = new ArrayList<String>();

		int i = 0;
		int j = 0;
		int k = 0;

		for (i = 0; i < s.length(); i++) {
			list.add("");
			for (j = k; j < s.length(); j++) {
				String tmp = String.valueOf(s.charAt(j));
				if (tmp.equals("A") || tmp.equals("C") || tmp.equals("G") || tmp.equals("T")) {
					list.set(i, list.get(i) + tmp);
				} else {
					k = j + 1;
					break;
				}
			}
			if (j == s.length()) {
				break;
			}
		}

		String ans = "";
		int max = 0;

		for (i = 0; i < list.size(); i++) {
			if (ans.length() < list.get(i).length()) {
				ans = list.get(i);
				max = ans.length();
			}
		}

		System.out.println(max);

	}

}
