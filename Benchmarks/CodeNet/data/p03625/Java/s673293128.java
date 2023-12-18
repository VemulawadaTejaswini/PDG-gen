import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

import org.xml.sax.HandlerBase;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		ArrayList<Integer> sides = new ArrayList<>();
		HashSet<Integer> bar = new HashSet<>();

		for (int i = 0; i < N; i++) {
			int ai = sc.nextInt();
			if (bar.contains(ai)) {
				sides.add(ai);
				bar.remove(ai);
			} else {
				bar.add(ai);
			}
		}

		Collections.sort(sides);

		int sz = sides.size();
		if (sz < 2) {
			System.out.println(0);
		} else {
			System.out.println((long) sides.get(sz - 1) * (long) sides.get(sz - 2));
		}

		sc.close();
	}
}