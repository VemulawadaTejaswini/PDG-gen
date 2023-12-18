import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int M = Integer.parseInt(scan.next());
		int X = Integer.parseInt(scan.next());
		int Y = Integer.parseInt(scan.next());

		List<Integer> xList = new ArrayList<>();
		List<Integer> yList = new ArrayList<>();
		xList.add(X);
		yList.add(Y);

		for (int i = 0; i < N; i++) {
			int inputX = Integer.parseInt(scan.next());
			xList.add(inputX);
		}
		for (int i = 0; i < M; i++) {
			int inputY = Integer.parseInt(scan.next());
			yList.add(inputY);
		}
		scan.close();

		int maxX = xList.get(0);
		int minY = yList.get(0);

		for (Integer x : xList) {
			if (maxX < x) {
				maxX = x;
			}
		}

		for (Integer y : yList) {
			if (y < minY) {
				minY = y;
			}
		}

		boolean isWar = true;

		if(maxX < minY && X < Y) {
			isWar = false;
		}

		if (isWar) {
			System.out.print("War");
		} else {
			System.out.print("NO War");
		}
	}
}