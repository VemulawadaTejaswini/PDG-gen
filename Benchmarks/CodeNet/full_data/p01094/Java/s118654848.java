import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Look for the Winner!
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			line = br.readLine();

			Candidate[] idx = new Candidate['Z' - 'A' + 1];
			List<Candidate> list = new ArrayList<>();
			list.add(new Candidate('\0'));

			//solve
			Candidate c = null;
			int d = -1;

			for (int i = 0, j = 1; i < line.length(); i += 2, j++) {
				int _c = line.charAt(i) - 'A';
				if (idx[_c] == null) {
					idx[_c] = new Candidate((char) (_c + 'A'));
					list.add(idx[_c]);
				}
				idx[_c].vote++;

				Collections.sort(list);

				if (list.get(0).vote > list.get(1).vote + n - j) {
					c = list.get(0);
					d = j;
					break;
				}
			}

			if (c != null) {
				System.out.printf("%c %d%n", c.name, d);
			} else {
				System.out.println("TIE");
			}
		} //end while

	} //end main
}

class Candidate implements Comparable<Candidate> {
	char name;
	int vote = 0;

	Candidate(char name) {
		this.name = name;
	}

	@Override
	public int compareTo(Candidate o) {
		return Integer.compare(o.vote, this.vote);
	}
}