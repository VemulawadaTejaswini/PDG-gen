import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tests = sc.nextInt();
		long indexVal = sc.nextLong();
		
		int[] aVals = new int[tests];
		int[] bVals = new int[tests];
		
		int bSum = 0;
		
		for (int i = 0; i < tests; i++) {
			aVals[i] = sc.nextInt();
			bVals[i] = sc.nextInt();
			bSum += bVals[i];
		}
		
		int[] finalResult = new int[bSum];
		
		int currIndex = 0;
		for (int i = 0; i < tests; i++) {
			for (int j = 0; j < bVals[i]; j++) {
				finalResult[currIndex++] = aVals[i];
			}
		}
		Arrays.sort(finalResult);
		
		System.out.println(finalResult[indexVal - 1]);
	}
}
