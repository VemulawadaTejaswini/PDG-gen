
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<String, Integer> memo = new TreeMap<String, Integer>(
				new Comparator<String>() {

					@Override
					public int compare(String o1, String o2) {
						if (o1.length() == o2.length())
							return o1.compareTo(o2);
						return o1.length() - o2.length();
					}
				});
		for (int i = 0; i < n; i++) {
			String s = scanner.next();
			int a = scanner.nextInt();
			if (memo.containsKey(s))
				memo.put(s, memo.get(s) + a);
			else
				memo.put(s, a);
		}
		for (Entry<String, Integer> entry : memo.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}