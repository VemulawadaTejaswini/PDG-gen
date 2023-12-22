import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
	private static HashSet<String> pattern = new HashSet<String>();

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int resultCount = 0;
	    while (true) {
		    String[] line = br.readLine().split(" ");

		    int n = Integer.parseInt(line[0]);
		    int x = Integer.parseInt(line[1]);

		    if (n == 0 && x == 0) break;


			for (int i = 0; i < 1000; i++) {
				String target = String.format("%03d", i);

				if (containsSame(target, n) && !getSortedArray(target) && sum(target) == 9) {
					resultCount++;
					continue;
				}
			}
	    }
		System.out.println(resultCount);

	}

	private static boolean containsSame(String s, int maxChar) {
		HashSet<String> target = new HashSet<String>();
		for (int i = 0; i < 3; i++) {
			String c = s.substring(i, i + 1);

			if (Integer.parseInt(c) <= 0 || Integer.parseInt(c) > maxChar) {
				return false;
			}

			if (target.contains(c)) {
				return false;
			} else {
				target.add(c);
			}
		}
		return true;
	}

	private static boolean getSortedArray(String s) {
		ArrayList<String> array = new ArrayList<String>();

		array.add(s.substring(0, 1));
		array.add(s.substring(1, 2));
		array.add(s.substring(2, 3));

		Collections.sort(array);

		if (pattern.contains(String.join("", array))) {
			return true;
		} else {
			pattern.add(String.join("", array));
			return false;
		}
	}

	private static int sum(String s) {
		return Integer.parseInt(s.substring(0, 1)) + Integer.parseInt(s.substring(1, 2)) + Integer.parseInt(s.substring(2, 3));
	}
}