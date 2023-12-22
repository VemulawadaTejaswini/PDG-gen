import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			list.clear();
			for (int i = 0; i < 6; i++) {
				list.add(scan.nextInt());
			}
			double x = ((list.get(2) * list.get(4) - list.get(1) * list.get(5))
					/ (list.get(0) * list.get(4) - list.get(1) * list.get(3)));
			double y = ((list.get(0) * list.get(5) - list.get(2) * list.get(3))
					/ (list.get(0) * list.get(4) - list.get(1) * list.get(3)));

			System.out.printf("%.3f %.3f", (x*1000)/1000, (y*1000)/1000);
			if (scan.hasNext()) {
				System.out.println();
			}
		}
	}
}