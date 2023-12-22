import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void split(LinkedList<Integer> list_first,
			LinkedList<Integer> list_last, int x, int y,
			LinkedList<Integer> a_list_first, LinkedList<Integer> a_list_last,
			LinkedList<Integer> b_list_first, LinkedList<Integer> b_list_last,
			LinkedList<Integer> c_list_first, LinkedList<Integer> c_list_last) {

		int first = 1;

		while (!list_first.isEmpty()) {
			final int card_first = list_first.poll();
			final int card_last = list_last.poll();

			final int last = first + (card_last - card_first);

			//System.out.println(x + " " + y + " " + first + " " + last + " "
			//		+ card_first + " " + card_last);

			if (first <= x && last <= x) {
				a_list_first.add(card_first);
				a_list_last.add(card_last);
			} else if (first <= x) {
				final int sp1 = x - first + 1;

				a_list_first.add(card_first);
				a_list_last.add(card_first + sp1 - 1);

				if (last <= y) {
					b_list_first.add(card_first + sp1);
					b_list_last.add(card_last);
				} else {
					final int sp2 = y - x;

					b_list_first.add(card_first + sp1);
					b_list_last.add(card_first + sp1 + sp2 - 1);

					c_list_first.add(card_first + sp1 + sp2);
					c_list_last.add(card_last);
				}

			} else if (first <= y && last <= y) {
				b_list_first.add(card_first);
				b_list_last.add(card_last);

			} else if (first <= y) {
				final int sp1 = y - first + 1;

				b_list_first.add(card_first);
				b_list_last.add(card_first + sp1 - 1);

				c_list_first.add(card_first + sp1);
				c_list_last.add(card_last);
			} else {
				c_list_first.add(card_first);
				c_list_last.add(card_last);
			}

			first = last + 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedList<Integer> list_first = new LinkedList<Integer>();
		LinkedList<Integer> list_last = new LinkedList<Integer>();
		LinkedList<Integer> a_list_first = new LinkedList<Integer>();
		LinkedList<Integer> a_list_last = new LinkedList<Integer>();
		LinkedList<Integer> b_list_first = new LinkedList<Integer>();
		LinkedList<Integer> b_list_last = new LinkedList<Integer>();
		LinkedList<Integer> c_list_first = new LinkedList<Integer>();
		LinkedList<Integer> c_list_last = new LinkedList<Integer>();

		while (true) {
			final int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			list_first.add(1);
			list_last.add(n);

			final int m = sc.nextInt();
			final int p = sc.nextInt();
			final int q = sc.nextInt();
			final int r = sc.nextInt();

			for (int i = 0; i < m; i++) {
				final int x = sc.nextInt();
				final int y = sc.nextInt();

				//System.out.println(list_first + " " + list_last);
				split(list_first, list_last, x, y, a_list_first, a_list_last,
						b_list_first, b_list_last, c_list_first, c_list_last);

				list_first.addAll(c_list_first);
				list_last.addAll(c_list_last);
				list_first.addAll(b_list_first);
				list_last.addAll(b_list_last);
				list_first.addAll(a_list_first);
				list_last.addAll(a_list_last);

				a_list_first.clear();
				a_list_last.clear();
				b_list_first.clear();
				b_list_last.clear();
				c_list_first.clear();
				c_list_last.clear();
			}

			//System.out.println(list_first);
			//System.out.println(list_last);

			int sum = 0;
			split(list_first, list_last, p - 1, q, a_list_first, a_list_last,
					b_list_first, b_list_last, c_list_first, c_list_last);
			// System.out.println(a_list + " " + b_list + " " + c_list);
			while (!b_list_first.isEmpty()) {
				final int first = b_list_first.poll();
				final int last = b_list_last.poll();

				//System.out.println(first + " : " + last);

				sum += Math.max(0, Math.min(last, r) - first + 1);
			}
			System.out.println(sum);

			a_list_first.clear();
			a_list_last.clear();
			b_list_first.clear();
			b_list_last.clear();
			c_list_first.clear();
			c_list_last.clear();
			
			System.gc();
		}
	}

}