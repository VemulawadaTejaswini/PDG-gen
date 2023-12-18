import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sd = sc.next();
		String t = sc.next();
		ArrayList<String> list = new ArrayList<String>();

		int i;
		for (i = 0; i < sd.length() - t.length() + 1; i++) {
			for (int j = 0; j < t.length(); j++) {
				if (sd.charAt(i + j) != '?' && sd.charAt(i + j) != t.charAt(j)) {
					break;
				}
			}
			if (i >= sd.length() - t.length() + 1) {
				list.add((sd.substring(0, i) + t + sd.substring(i + t.length())).replace('?', 'a'));
			}
		}
		list.sort(null);
		if (list.size() == 0) {
			System.out.println("UNRESTORABLE");
		} else {
			System.out.println(list.get(0));
		}
	}

}
