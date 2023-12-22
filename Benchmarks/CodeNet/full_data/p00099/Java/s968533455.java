/**
 * Surf Smelt Fishing Contest II
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int q = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			List<Angler> anglers = new ArrayList<Angler>();
			Queue<Angler> catch_ = new PriorityQueue<Angler>(11,
					new Comparator<Angler>() {
						@Override
						public int compare(Angler o1, Angler o2) {
							if (o1.catch_ == o2.catch_) {
								return o1.id - o2.id;
							} else {
								return o2.catch_ - o1.catch_;
							}
						}
					});

			for (int i = 0; i <= n; i++) {
				Angler a = new Angler(i);
				anglers.add(a);
				catch_.add(a);
			}
			anglers.get(0).catch_ = -1;

			for (int i = 0; i < q; i++) {
				line = br.readLine();
				int a = Integer.parseInt(line.substring(0, line.indexOf(' ')));
				int v = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
				Angler _a = anglers.get(a);
				_a.catch_ += v;
				catch_.remove(_a);
				catch_.add(_a);
				System.out.println(catch_.peek().id + " " + catch_.peek().catch_);
			}
		} //end while
	} //end main
}

class Angler {
	int id;
	int catch_ = 0;

	Angler(int id) {
		this.id = id;
	}
}