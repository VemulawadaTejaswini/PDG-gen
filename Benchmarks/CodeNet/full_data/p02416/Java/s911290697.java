
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			String number = scn.nextLine();
			if (number.equals("0")) {
				break;
			}
			char[] changedData = number.toCharArray();
			int sum = 0;
			for (int i = 0; i < changedData.length; i++) {
				sum = sum + Character.getNumericValue(changedData[i]);
			}
			System.out.println(sum);
		}
	}
}
 
