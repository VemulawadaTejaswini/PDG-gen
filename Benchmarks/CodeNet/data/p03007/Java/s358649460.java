import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int INF = 1000000007;
		int n = sc.nextInt();

		Integer[] a = new Integer[n];

		LinkedList<Integer> plus = new LinkedList<>();
		LinkedList<Integer> minus = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			a[i] = num;
			if (num > 0) {
				plus.add(num);
			} else {
				minus.add(num);
			}
		}

		Collections.sort(plus);
		Collections.sort(minus);

		if (minus.size() == 0) {
			minus.addLast(plus.removeFirst());
		}
		if (plus.size() == 0) {
			plus.add(minus.removeLast());
		}

		List<Integer> x = new ArrayList<>();
		List<Integer> y = new ArrayList<>();

		while (minus.size() >= 2) {
			int minusTop = minus.pop();
			int plusTop = plus.removeLast();

			int pl = plusTop - minusTop;

			x.add(plusTop);
			y.add(minusTop);

			plus.addLast(pl);

//			System.out.println(minusTop);
//			System.out.println(plusTop);
		}

		while (plus.size() >= 2) {
			int minusTop = minus.removeLast();
			int plusTop = plus.pop();

			int mi = minusTop - plusTop;
			x.add(minusTop);
			y.add(plusTop);
			minus.addLast(mi);
//			System.out.println(minusTop);
//			System.out.println(plusTop);
		}

//		System.out.println(plus);
//		System.out.println(minus);

		int p = plus.removeFirst();
		int m = minus.removeLast();

		int ans = p - m;
		System.out.println(ans);
		for (int i = 0; i < x.size(); i++) {

			System.out.println(x.get(i) + " " + y.get(i));

		}
		System.out.println(p + " " + m);

	}

}
