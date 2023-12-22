import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			String word = sc.next();
			String query = sc.next();
			if (query.equals("X")) break;
			ArrayList<String> elems = new ArrayList<String>();
			if (word.indexOf("_") >= 0) {
				String[] vals = word.split("_");
				for (String val : vals) {
					elems.add(val);
				}
			} else {
				int pos = 0;
				for (int i = 1; i < word.length(); ++i) {
					if (Character.isUpperCase(word.charAt(i))) {
						elems.add(word.substring(pos, i).toLowerCase());
						pos = i;
					}
				}
				elems.add(word.substring(pos).toLowerCase());
			}
			StringBuilder result = new StringBuilder();
			if (query.equals("U")) {
				for (int i = 0; i < elems.size(); ++i) {
					result.append(Character.toUpperCase(elems.get(i).charAt(0)));
					result.append(elems.get(i).substring(1));
				}
			} else if (query.equals("L")) {
				result.append(elems.get(0));
				for (int i = 1; i < elems.size(); ++i) {
					result.append(Character.toUpperCase(elems.get(i).charAt(0)));
					result.append(elems.get(i).substring(1));
				}
			} else {
				result.append(elems.get(0));
				for (int i = 1; i < elems.size(); ++i) {
					result.append("_");
					result.append(elems.get(i));
				}
			}
			System.out.println(result);
		}
	}
}