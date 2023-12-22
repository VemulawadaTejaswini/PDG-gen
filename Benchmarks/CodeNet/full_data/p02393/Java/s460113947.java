import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();

		String[] inputStrArray = inputStr.split(" ");
		int[] inputIntArray = new int[inputStrArray.length];

		try {
			for (int index = 0; index < inputIntArray.length; index++) {
				inputIntArray[index] = Integer.parseInt(inputStrArray[index]);
			}
			int tmp;

			for (int i = 1; i < inputIntArray.length; i++) {
				for (int j = 1; j < inputIntArray.length; j++) {
					if (inputIntArray[j - 1] > inputIntArray[j]) {
						tmp = inputIntArray[j - 1];
						inputIntArray[j - 1] = inputIntArray[j];
						inputIntArray[j] = tmp;
					}
				}
			}
			boolean firstFlg = false;
			for (int i : inputIntArray) {
				System.out.print(i);
				if (firstFlg) {
					System.out.print(", ");
				}
				System.out.print(i);
				firstFlg = true;
			}

		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}

