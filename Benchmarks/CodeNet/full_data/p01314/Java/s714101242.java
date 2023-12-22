import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try {
			Scanner scanResult = new Scanner(System.in);
			// ??????????????????????????????
			ArrayList<String> inputNumbers = getInputNumbers(scanResult);

			for(String inputNumber : inputNumbers) {
				int maxNum = 0;
				int inputNumberTmp = Integer.parseInt(inputNumber);
				if (inputNumberTmp%2 == 0){
					maxNum = inputNumberTmp/2;
				} else {
					maxNum = inputNumberTmp/2 + 1;
				}
				int nTmp = 0;
				Integer count = 0;
				for (int presentMaxNum = maxNum; presentMaxNum <= maxNum; presentMaxNum--){
					for (int presentNum = presentMaxNum; presentNum <= presentMaxNum; presentNum--) {
						nTmp = nTmp + presentNum;
						if(nTmp < inputNumberTmp) {
							continue;
						} else if (nTmp == inputNumberTmp) {
							count++;
							break;
						} else if (nTmp > inputNumberTmp) {
							break;
						}
					}
				}
				System.out.println(count);
			}
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}
	}

	private static ArrayList<String> getInputNumbers(Scanner scanResult){
		ArrayList<String> inputNumbers = new ArrayList<String>();
		String str = null;
		if(scanResult != null){
			while(true){
				if(scanResult.hasNext() == true){
					str = scanResult.nextLine();
					inputNumbers.add(str);
				} else {
					return inputNumbers;
				}
			}
		} else {
			return null;
		}
	}
}