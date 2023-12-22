import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> numList = new ArrayList<>();
		while (true) {
			String tmp = br.readLine();
			if (tmp == null || "".equals(tmp)) {
				break;
			}
			int num = Integer.valueOf(tmp);
			numList.add(num);
		}
		printPrimeNumberCount(numList);
	}

	private static void printPrimeNumberCount(ArrayList<Integer> numList) {
		for (int x : numList) {
			if (x <= 1) {
				System.out.println(0);
				continue;
			}
			int i, j;
			int count = 0;
			for (i = 2; i <= x; i++) {
				int square = (int)Math.sqrt(i);
				for (j = 2; j <= square; j++) {
					if (i % j == 0)
						break;
				}
				if (j > square) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}