import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();
			String[] dataArray = data.split(" ");

			int total = Integer.parseInt(dataArray[0]);
			int legs = Integer.parseInt(dataArray[1]);

			boolean hasPattern = false;
			if (legs % 2 == 0) {
				int min = 2 * total;
				int max = 4 * total;
				if (min <= legs && legs <= max) {
					hasPattern = true;
				}
			}

			System.out.println(hasPattern ? "Yes" : "No");
		}
	}
}