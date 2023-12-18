import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		Integer n = sc.nextInt();
		Integer m = sc.nextInt();
		Integer x = sc.nextInt();
		Integer y = sc.nextInt();

		List<Integer> xList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			xList.add(sc.nextInt());
		}
		List<Integer> yList = new ArrayList<Integer>();
		for (int j = 0; j < m; j++) {
			yList.add(sc.nextInt());
		}
		Collections.sort(xList);
		Collections.sort(yList);
		Collections.reverse(xList);

		boolean war = true;
		if (x < yList.get(0) && yList.get(0) <= y) {
			if (xList.get(0) < yList.get(0)) {
				war = false;
			}
		}

		System.out.println(war ? "War" : "Not War");

	}

}
