import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) throws Exception {
		Main main = new Main();

		try (Scanner scan = new Scanner(System.in)) {
			main.evenRelation(scan);
		}
	}

	private void evenRelation(Scanner scan) {
		int n = scan.nextInt();
		int[] ans = IntStream.iterate(-1, i -> i).limit(n).toArray();
		List<List<Integer>> w = IntStream.range(0, n - 1)
			.mapToObj(i -> IntStream.range(0, 3)
				.map(j -> scan.nextInt())
				.boxed()
				.collect(Collectors.toList()))
			.collect(Collectors.toList());

		w.stream().forEachOrdered(w1 -> {
			int u1 = w1.get(0) - 1;
			ans[u1] = ans[u1] == -1 ? 0 : ans[u1];
			int v1 = w1.get(1) - 1;
			if (w1.get(2) % 2 == 0) {
				ans[v1] = ans[u1];
			} else {
				ans[v1] = (ans[u1] + 1) % 2;
			}
		});

		Arrays.stream(ans).filter(i -> i != -1).forEachOrdered(System.out::println);
	}

	private void diceAndCoin(Scanner scan) {
		int n = scan.nextInt();
		int k = scan.nextInt();

		double ans = IntStream.rangeClosed(1, n)
			.mapToDouble(i -> ((double) 1 / n) * powProb(k, i))
			.sum();

		System.out.println(ans);
	}

	private double powProb(int k, int i) {
		return (double) 1 / Math.pow(2, Math.ceil((Math.log(Math.ceil((double) k / i))) / Math.log(2)));
	}

	private void yymmOrMmyy(Scanner scan) {
		String s = scan.next();

		int f = Integer.valueOf(s.substring(0, 2));
		int l = Integer.valueOf(s.substring(2, 4));
		boolean yOkF = true, yOkL = true;

		if (f > 12 || f < 1) {
			yOkF = false;
		}
		if (l > 12 || l < 1) {
			yOkL = false;
		}
		if (yOkF) {
			if (yOkL) {
				System.out.println("AMBIGUOUS");
			} else {
				System.out.println("MMYY");
			}
		} else {
			if (yOkL) {
				System.out.println("YYMM");
			} else {
				System.out.println("NA");
			}
		}

	}

	private void changingACharchter(Scanner scan) {
		scan.nextInt();
		int k = scan.nextInt();
		char[] s = scan.next().toCharArray();

		s[k - 1] = Character.toLowerCase(s[k - 1]);
		System.out.println(new String(s));

	}

}
