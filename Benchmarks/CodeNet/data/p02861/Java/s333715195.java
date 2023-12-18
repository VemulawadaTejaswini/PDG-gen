
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static String next_permutation(String S) {

		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < S.length(); i++) {
			list.add(S.charAt(i));
		}

		char pivot = 0;
		int pivotPos = -1;

		for (int i = list.size() - 2; i >= 0; i--) {
			if (list.get(i + 1) > list.get(i)) {
				pivot = list.get(i);
				pivotPos = i;
				break;
			}
		}

		if (pivot == 0 && pivotPos == -1) {
			return "Final";
		}

		int L = pivotPos + 1;
		int R = list.size() - 1;

		int minPos = -1;
		char min = Character.MAX_VALUE;

		for (int i = R; i >= L; i--) {
			if (pivot < list.get(i)) {
				if (list.get(i) < min) {
					min = list.get(i);
					minPos = i;
				}
			}
		}

		Collections.swap(list, pivotPos, minPos);
		Collections.sort(list.subList(L, R + 1));

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}

		return sb.toString();
	}

	static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	static List<Integer> StringToList(String str) {
		List<Integer> list = new ArrayList<Integer>();
		StringTokenizer tokenizer = new StringTokenizer(str, "");
		while (tokenizer.hasMoreTokens()) {
			list.add(Integer.valueOf(tokenizer.nextToken()));
		}
		return list;
	}

	static double Distance(int x1, int x2, int y1, int y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		double total = 0;
		List<Integer> list = new ArrayList<Integer>();

		String S = "";

		for (int i = 0; i < N; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
			S = S.concat(String.valueOf(i + 1));
			list.add(i, Character.getNumericValue(S.charAt(i)));
		}

		for (int k = 0; k < factorial(N); k++) {

			for (int i = 0; i < list.size() - 1; i++) {

				total += Distance(x[list.get(i) - 1], x[list.get(i + 1) - 1], y[list.get(i) - 1],
						y[list.get(i + 1) - 1]);
			}

			S = next_permutation(S);

			if (k != factorial(N) - 1) {

				for (int j = 0; j < N; j++) {

					list.set(j, Character.getNumericValue(S.charAt(j)));
				}
			}
			//System.out.println(S);

			/*
			if (S.equals("Final")) {
				break;
			}
			*/
		}
		System.out.println(total / (double) factorial(N));

		scan.close();

	}
}
