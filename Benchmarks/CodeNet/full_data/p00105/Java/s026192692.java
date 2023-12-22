import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	/**
	 * @param args65538
	 */
	public static void main(String[] args) throws java.io.IOException {

		Scanner scan = new Scanner(System.in);
		Map<String, ArrayList<Integer>> index = new HashMap<String, ArrayList<Integer>>();
		ArrayList<String> keys = new ArrayList<String>();
		while (scan.hasNext()) {

			String key = scan.next();
			int value = scan.nextInt();

			if (!index.containsKey(key)) {
				keys.add(key);
				ArrayList<Integer> tmp = new ArrayList<Integer>();
				tmp.add(value);
				index.put(key, tmp);
			} else {
				ArrayList<Integer> list = index.get(key);
				list.add(value);
			}
		}
		Collections.sort(keys);
		for (int i = 0; i < keys.size(); i++) {
			String key = keys.get(i);
			System.out.println(key);
			ArrayList<Integer> cout = new ArrayList<Integer>();
			cout = index.get(key);
			Collections.sort(cout);
			boolean isFirst = true;

			for (int j = 0; j < cout.size(); j++) {
				if (isFirst) {
					isFirst = false;
				} else {
					System.out.print(" ");
				}
				System.out.print(cout.get(j));
			}
			System.out.println();

		}
	}
}