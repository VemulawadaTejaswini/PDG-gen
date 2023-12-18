import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		List<Integer> P = new ArrayList<>();
		List<Integer> Q = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			P.add(sc.nextInt());
		}
		for (int i = 0; i < N; i++) {
			Q.add(sc.nextInt());
		}

		sc.close();

		List<Integer> l = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			l.add(i);
		}

		List<List<Integer>> x = permutations(l, N);

		x.sort((a, b) -> a.toString().compareTo(b.toString()));

		int a = 0, b = 0;
		for (int i = 0; i < x.size(); i++) {
			if (P.equals(x.get(i))) {
				a = i;
			}
			if (Q.equals(x.get(i))) {
				b = i;
			}
		}

		out.println(Math.abs(a - b));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	private static <T> List<List<T>> permutations(List<T> l, int r) {
		if (r == 0) {
			return new ArrayList<List<T>>() {
				{
					add(new ArrayList<T>());
				}
			};
		}

		List<List<T>> result = new ArrayList<>();

		for (int i = 0; i < l.size(); i++) {
			T a = l.get(i);
			List<T> ll = new ArrayList<>(l);
			ll.remove(i);

			List<List<T>> s = permutations(ll, r - 1);
			for (List<T> ss : s) {
				List<T> z = new ArrayList<>();
				z.add(a);
				z.addAll(ss);
				result.add(z);
			}

		}

		return result;
	}
}
