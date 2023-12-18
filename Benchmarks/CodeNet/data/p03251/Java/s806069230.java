

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		SortedSet<Integer> setX = new TreeSet<Integer>();
		SortedSet<Integer> setY = new TreeSet<Integer>();

		for (int i = 0; i < N; i++) {
			setX.add(sc.nextInt());
		}

		for (int i = 0; i < M; i++) {
			setY.add(sc.nextInt());
		}

		System.out.println(result(X, Y, setX, setY));

		sc.close();
	}

	private static String result(int X, int Y, SortedSet<Integer> setX,
			SortedSet<Integer> setY) {
		int maxX = setX.last();
		maxX = Math.max(X, maxX);

		int minY = setY.first();
		minY = Math.min(Y, minY);

		if (maxX + 1 <= minY) {
			return "No War";
		} else {
			return "War";
		}
	}
}