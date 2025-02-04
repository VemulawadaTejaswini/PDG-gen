import java.util.*;

import java.util.Map.Entry;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		for (;;) {

			int n = sc.nextInt();

			if (n == 0)

				break;

			boolean na = true;

			int[] order = new int[n];

			HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();



			for (int i = 0; i < n; i++) {

				int b = sc.nextInt();

				int at = sc.nextInt();

				int p = sc.nextInt();

				if (h.containsKey(b)) {

					int value = h.get(b);

					h.put(b, value + at * p);

				} else {

					order[i] = b;

					h.put(b, at * p);

				}

			}

			for (int i = 0; i < n; i++) {

				if (order[i] != 0) {

					int e = order[i];

					if (h.get(e) >= 1e6) {

						na = false;

						System.out.println(e);

					}

				}

			}

			if (na)

				System.out.println("NA");

		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}