import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> inList = new ArrayList<Integer>();
		ArrayList<Integer> outList = new ArrayList<Integer>();

		while (scanner.hasNext()) {

			int num = input();

			if (num == 0) {

				outList.add(inList.remove(inList.size() - 1));

			} else {

				inList.add(num);

			}
		}

		for (int j = 0; j < outList.size(); j++) {

			System.out.println(outList.get(j));

		}

		close();

	}

	public static int input() {

		return scanner.nextInt();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}