import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @see <a href='http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?lang=jp&id='>??????</a>
 */
public class Main {
	private static Scanner in = new Scanner(System.in);
	private static final String STABLE = "Stable";
	private static final String NOT_STABLE = "Not stable";

	public static void main(String[] args) throws Exception {
		Main main = new Main();
		main.run();
	}

	private void run() {
		int n = in.nextInt();
		String[] vals = in.nextLine().split(" ");

		String[] bubble = bubbleSort(vals);
		String[] selection = selectionSort(vals);
		Arrays.sort(vals);

		printResult(bubble, vals);
		printResult(selection, vals);
	}

	private void printResult(String[] sorted, String[] stable) {
		Arrays.stream(sorted).collect(Collectors.joining(" "));
		System.out.println(Arrays.equals(sorted, stable) ? STABLE : NOT_STABLE);
	}

	private String[] bubbleSort(String[] vals) {
		String[] sorted = Arrays.stream(vals).collect(Collectors.toList()).toArray(new String[]{});
		for (int i = 0; i < sorted.length; i++) {
			for (int j = sorted.length - 1; j > i; j--) {
				if (vals[j].charAt(1) < vals[j - 1].charAt(1)) {
					swap(j, j - 1, vals);
				}
			}
		}
		return sorted;
	}

	private String[] selectionSort(String[] vals) {
		String[] sorted = Arrays.stream(vals).collect(Collectors.toList()).toArray(new String[]{});
		return sorted;
	}

	private void swap(int i, int j, String[] vals) {
		String temp = vals[i];
		vals[i] = vals[j];
		vals[j] = temp;
	}
}