import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			String[] tmp = scanner.nextLine().split(" ");
			int[] line = Stream.of(tmp).mapToInt(Integer::parseInt).toArray();
			int correctNum = line[0];
			int correctYen = line[1];

			for (int x = 0; x <= correctNum; x++) {
				for (int y = 0; y <= correctNum - x; y++) {
					int z = correctNum - (x + y);

					int sumYen = 10000 * x + 5000 * y + 1000 * z;
					if (sumYen == correctYen) {
						int num = x + y + z;
						if (correctNum == num) {
							System.out.print(String.valueOf(x) + " " + String.valueOf(y) + " " + String.valueOf(z));
							return;
						}
					}
				}
			}
			System.out.print("-1 -1 -1");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
