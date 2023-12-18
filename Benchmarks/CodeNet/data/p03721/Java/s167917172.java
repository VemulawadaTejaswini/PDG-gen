import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tests = sc.nextInt();
		int indexVal = sc.nextInt();
		
		int[] aVals = new int[tests];
		int[] bVals = new int[tests];
		
		int bSum = 0;
		
		for (int i = 0; i < tests; i++) {
			aVals[i] = sc.nextInt();
			bVals[i] = sc.nextInt();
			bSum += bVals[i];
		}
		
		for (int i = 0; i < tests; i++) {
			int currMin = aVals[i];
			int currInd = i;
			for (int j = i; j < tests; j++) {
				if (aVals[j] < currMin) {
					currMin = aVals[j];
					currInd = j;
				}
			}
			int tempSwap = aVals[i];
			aVals[i] = currMin;
			aVals[currInd] = tempSwap;
			
			tempSwap = bVals[i];
			bVals[i] = bVals[currInd];
			bVals[currInd] = tempSwap;
		}
		
		int counter = 0;
		
		int finalResult = 0;
		
		for (int i = 0; i < tests; i++) {
			counter += bVals[i];
			if (counter >= indexVal) {
				finalResult = aVals[i];
				break;
			}
		}
		
		System.out.println(finalResult);
	}
}
