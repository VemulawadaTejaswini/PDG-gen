import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		List<Integer> dicevalue = new ArrayList<>();
		int top, front;
		int q;

		int[][] line = {
				{ 2, 3, 5, 4 },
				{ 1, 4, 6, 3 },
				{ 1, 2, 6, 5 },
				{ 1, 5, 6, 2 },
				{ 1, 3, 6, 4 },
				{ 2, 4, 5, 3 },
		};

		Scanner stdIn = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			dicevalue.add(stdIn.nextInt());
		}
		stdIn.nextLine();

		Map<Integer, int[]> dicemap = new HashMap<>();

		for (int i = 0; i < 6; i++) {
			dicemap.put(dicevalue.get(i), line[i]);
		}
		q = stdIn.nextInt();
		stdIn.nextLine();

		for (int j = 0; j < q; j++) {
			top = stdIn.nextInt();
			front = stdIn.nextInt();
			stdIn.nextLine();

			int[] tempary = dicemap.get(top);

			int frontindex = dicevalue.indexOf(front) + 1;
			int leftindex = 0;
			;

			for (int i = 0; i < 4; i++) {
				if (tempary[i] == frontindex) {
					if (i == 3) {
						leftindex = tempary[0];
					} else {
						leftindex = tempary[i + 1];
					}
				}
			}
			System.out.println(dicevalue.get((leftindex) - 1));
		}

		stdIn.close();
	}
}