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

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int seriesNum = Integer.parseInt(br.readLine());
		String[] series = br.readLine().split(" ");
		int[] cardNumberResult = new int[seriesNum];

		for (int i = 0; i < seriesNum; i++){
			cardNumberResult[i] = Integer.parseInt(series[i]);
		}
		for (int i = 0; i < seriesNum; i++){
			if (i == 0){
				printArray(cardNumberResult);
			}
			
			if (i == seriesNum -1){
				break;
			}
			for (int j = i + 1; 0 < j ; j--) {

				if (cardNumberResult[j] < cardNumberResult[j - 1]){
					int tmp = cardNumberResult[j - 1];
					cardNumberResult[j - 1] = cardNumberResult[j];
					cardNumberResult[j] = tmp;
				}
				else {
					break;
				}
			}
			printArray(cardNumberResult);
		}
	}
}