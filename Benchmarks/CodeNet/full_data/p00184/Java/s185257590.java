import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NavigableMap;
import java.util.TreeMap;

import static java.lang.Integer.parseInt;

public class Main {

	static final NavigableMap<Integer, Integer> ages = new TreeMap<Integer, Integer>() {
		{
			put(0, 0);
			put(10, 1);
			put(20, 2);
			put(30, 3);
			put(40, 4);
			put(50, 5);
			put(60, 6);
		}
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;

			int[] count = new int[7];
			for (int i = 0; i < n; i++) {
				count[ages.floorEntry(parseInt(br.readLine())).getValue()]++;
			}
			for (int c : count) System.out.println(c);
		}
	}
}