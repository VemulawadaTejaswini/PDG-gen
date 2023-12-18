import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		sc.close();

		double[][] d = new double[N][N];
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				double dx = (x[i] - x[j]) * (x[i] - x[j]);
				double dy = (y[i] - y[j]) * (y[i] - y[j]);
				d[i][j] = Math.sqrt(dx + dy);
				d[j][i] = d[i][j];
			}
		}
		List<List<Integer>> p = permutations(IntStream.range(0, N).boxed().collect(Collectors.toList()), N);

		double sum = 0;
		for (List<Integer> l : p) {
			double tmp = 0;
			for (int i = 1; i < l.size(); i++) {
				tmp += d[l.get(i - 1)][l.get(i)];
			}
			sum += tmp;
		}

		out.println(sum / p.size());

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

	private static <T> List<T> remove(List<T> l, T e) {
		List<T> newList = new ArrayList<>(l);
		newList.remove(e);
		return newList;
	}

	private static <T> List<T> cons(T head, List<T> tail) {
		List<T> newList = new ArrayList<>();
		newList.add(head);
		newList.addAll(tail);
		return newList;
	}
}
