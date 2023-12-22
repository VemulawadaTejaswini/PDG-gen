import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void printArray(int[] intArray){
		for (int i = 0; i < intArray.length; i++){
			System.out.print(intArray[i]);

			if (i == intArray.length - 1){
				break;
			}
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int progNumLength = Integer.parseInt(br.readLine());

		String[] progNum = br.readLine().split(" ");

		int[] progNumResult = new int[progNumLength];

		for(int i = 0; i < progNumLength; i++) {
			progNumResult[i] = Integer.parseInt(progNum[i]);
		}

		int sortCount = 0;
		int sortFlag = 1;

		while(sortFlag == 1) {
			sortFlag = 0;

			for(int i = progNumLength - 1; i > 0; i--) {
				if(progNumResult[i] < progNumResult[i - 1]) {
					int tmp = progNumResult[i - 1];
					progNumResult[i - 1] = progNumResult[i];
					progNumResult[i] = tmp;
					sortCount++;
					sortFlag = 1;
				}
			}
		}
		printArray(progNumResult);
		System.out.println(sortCount);
	}
}