import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int n;
		int b, f, r, v;

		List<int[][]> house = new ArrayList<>();
		for (int i = 1; i <= 4; i++) {
			house.add(new int[3][10]);
		}

		Scanner stdIn = new Scanner(System.in);

		n = stdIn.nextInt();

		for (int i = 0; i < n; i++) {
			b = stdIn.nextInt();
			f = stdIn.nextInt();
			r = stdIn.nextInt();
			v = stdIn.nextInt();

			house.get(b-1)[f-1][r-1] = v;

		}

		for(int[][] floor : house) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 10; j++) {
					System.out.print(" " + floor[i][j]);
				}
				System.out.println();
			}
			System.out.println("####################");
		}

	}

}