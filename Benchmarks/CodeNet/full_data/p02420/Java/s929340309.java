
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			String inputData = scn.next();
			if (inputData.equals("-")) {
				break;
			}
			//char[] inputDatas = inputData.toCharArray();
			int count = scn.nextInt();
			int shuffleCount;
			for (int i = 0; i < count; i++) {
				shuffleCount = scn.nextInt();
				inputData = inputData.substring(shuffleCount) + inputData.substring(0, shuffleCount);
			}
			System.out.println(inputData);
			//String ChangedData = new String(inputDatas);
			//System.out.println(ChangedData);
		}
	}
}

