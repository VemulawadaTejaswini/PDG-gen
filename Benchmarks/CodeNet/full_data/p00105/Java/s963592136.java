
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, List<Integer>> memo = new TreeMap<String, List<Integer>>();
		while (scanner.hasNext()) {
			String word = scanner.next();
			if(word.equals("a"))
				break;
			int page = scanner.nextInt();

			if (!memo.containsKey(word)) {
				memo.put(word, new ArrayList<Integer>());
			}
			memo.get(word).add(page);
		}
		for (Entry<String, List<Integer>> entry : memo.entrySet()) {
			Collections.sort(entry.getValue());
			System.out.println(entry.getKey());
			for (int i = 0; i < entry.getValue().size(); i++) {
				if (i != 0) {
					System.out.print(" ");
				}
				System.out.print(entry.getValue().get(i));
			}
			System.out.println();
		}

	}

}