import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Organize Your Train part II
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			for (int i = 0; i < n; i++) {
				HashSet<String> trains = new HashSet<String>();
				line = br.readLine();
				for (String train : organize(line)) {
					if (!trains.contains(train)) trains.add(train);
				}
				System.out.println(trains.size());
			}
		} // end while
	} // end main

	static List<String> organize(String line) {
		List<String> os = new ArrayList<String>();
		for (int j = 1; j < line.length(); j++) {
			String t1 = line.substring(0, j);
			String t2 = line.substring(j);
			//
			os.add(t1 + t2);
			os.add(t1 + new StringBuilder(t2).reverse().toString());
			os.add(new StringBuilder(t1).reverse().toString() + t2);
			os.add(new StringBuilder(t1).reverse().toString() + new StringBuilder(t2).reverse().toString());
			//
			os.add(t2 + t1);
			os.add(t2 + new StringBuilder(t1).reverse().toString());
			os.add(new StringBuilder(t2).reverse().toString() + t1);
			os.add(new StringBuilder(t2).reverse().toString() + new StringBuilder(t1).reverse().toString());
		}
		return os;
	}
}