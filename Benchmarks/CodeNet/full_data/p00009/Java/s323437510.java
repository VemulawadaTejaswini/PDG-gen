import java.util.Scanner;

public class Main {

	/**
	 * 6 ?????\????????£?????´??° n ?????\?????????n ??\???????´???°????????????????????????????????????????????°??????????????????????????????
	 * 
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int inputNum = sc.nextInt();
			int count = 0; // ?´???°????????°

			for (int i = 2; i <= inputNum; i++) {
				int yakusuu = 0; // ?´???°?????°

				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						yakusuu += 1;

					}
				}
				// ?´???°????????¨???????????????????´???°
				if (yakusuu == 0) {
					// System.out.print(i + ",");
					count += 1;
				}
			}
			System.out.println(count);

		}
	}

}