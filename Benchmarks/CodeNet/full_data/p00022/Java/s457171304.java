import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0022_MaximumSumSequence {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem0022_MaximumSumSequence test = new Problem0022_MaximumSumSequence();
			Main test = new Main();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String line;
			while((line = reader.readLine()) != null) {
				int termNumber = Integer.parseInt(line);
				if(termNumber == 0) {
					break;
				}
				int[] numbers = new int[termNumber];
				for(int i = 0; i < numbers.length; i++) {
					numbers[i] = Integer.parseInt(reader.readLine());
				}
				
				test.showAnswer(numbers);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	void showAnswer(int[] array) {
		int[] numbers = array;
		int maxSum = numbers[0];		//®ÌÍÍÍ(-1000 <= a <= 1000)
		for(int i = 0; i < numbers.length; i++) {
			if(-1 < maxSum) {
				if(numbers[i] < 0) {
					//do nothing
				} else {
				//	System.out.println("  :" + i + ":\t" +maxSum);
					int maxCandidate = getMaxSumFromIndex(numbers, i);
					if(maxSum < maxCandidate) {
						maxSum = maxCandidate;
					}
				}
			} else if(0 < numbers[i]) {
				maxSum = getMaxSumFromIndex(numbers, i);
			} else if(maxSum < numbers[i] ) {
				maxSum = numbers[i];
			}
		//	System.out.println("»óF" +i  + ":\t" +  maxSum);
		}
		System.out.println(maxSum);
	}
	private int getMaxSumFromIndex(int[] array, int start) {
	//	System.out.println("getMaxSumFromIndex:start" +start); 
		int maxSum = Integer.MIN_VALUE;
		int summation = 0;
		for(int i = start; i < array.length; i++) {
		//	System.out.println("summation:" + summation + "array[" + i + "] = " + array[i]);
			summation += array[i];
			if(maxSum < summation) {
				maxSum = summation;
			}
		}
		
		return maxSum;
	}
}