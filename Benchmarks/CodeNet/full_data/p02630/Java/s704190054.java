import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int length = Integer.parseInt(scanner.nextLine());

		String numbers = scanner.nextLine();

		int quantity = Integer.parseInt(scanner.nextLine());

		String[] numberForChange = new String[quantity];
		
		SumSum sussm = new SumSum(numbers, quantity);
		
		for (int i = 0; i < quantity; i++) {
			numberForChange[i] = scanner.nextLine();
		}
		
		sussm.run(numberForChange);
		
	}


}




public class SumSum {
	
//	public static void main(String[] args) {
//		Va.main(null);
//	}

	private String[] array;
	private int[] arrayNumbers = new int[100001];
	private long sum;
	private long[] arrayOfSum;
	

	public SumSum(String numbers, int quantityNumbersForChage) {
		this.array = numbers.split(" ");
		this.arrayOfSum = new long[quantityNumbersForChage];
		createIntArray();
	}

	public void run(String[] numbersForChage) {
		String[] twoNumber;
		int oldNumber = 0;
		int newNumber = 0;
		int quantity = 0;
		int difference = 0;
		int i = 0;
		for(String str : numbersForChage) {
			twoNumber = str.split(" ");
			oldNumber = Integer.parseInt(twoNumber[0]);
			newNumber = Integer.parseInt(twoNumber[1]);
			quantity = arrayNumbers[oldNumber];
			if (quantity == 0) {
				System.out.println("AAA");
				//System.out.println(sum);
				arrayOfSum[i++] = sum;
				continue;
			}

			difference = newNumber - oldNumber;
			sum += (difference * quantity);
			//System.out.println(sum);
			arrayOfSum[i++] = sum;
			arrayNumbers[oldNumber] = 0;
			arrayNumbers[newNumber] += quantity;
		}
		
		for(long n : arrayOfSum) {
			System.out.println(n);
		}
		
}

	private void createIntArray() {
		for (String s : array) {
			int number = Integer.parseInt(s);
			arrayNumbers[number] += 1;
			sum += number;
		}
	}
	
}