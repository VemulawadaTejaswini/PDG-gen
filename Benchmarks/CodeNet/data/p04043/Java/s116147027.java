import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String line = null;
		try (Scanner sc = new Scanner(System.in)) {
			line = sc.nextLine();

			String[] tmpArray = line.split(" ");
			int cntFive = 0;
			int cntSeven = 0;
			for (String tmpStr : tmpArray) {
				if (tmpStr.equals("5")) {
					cntFive++;
				} else if (tmpStr.equals("7")) {
					cntSeven++;
				}
			}

			String result = "NO";
			if (cntFive == 2 && cntSeven == 1) {
				result = "YES";
			}

			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}