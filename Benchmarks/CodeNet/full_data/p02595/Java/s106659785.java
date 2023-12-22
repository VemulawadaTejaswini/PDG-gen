import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int D = sc.nextInt();

		int count = 0;
		List<Integer> xNum = new ArrayList<Integer>();
		List<Integer> yNum = new ArrayList<Integer>();

		start:for(int i = 0; i < N; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();
			xNum.add(x);
			yNum.add(y);

			double X = Math.pow(x, 2);
			double Y = Math.pow(y, 2);

			for(int j = 0; j < xNum.size(); j++) {
				if(xNum.get(j) == x && yNum.get(j) == y) {
					continue start;
				}
			}
			if(D >= Math.sqrt(X + Y)) {
				count++;
			}

		}
		System.out.println(count);
	}

}
