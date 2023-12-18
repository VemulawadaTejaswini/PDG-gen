import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] intArr = new int[3];
		intArr[0] = scanner.nextInt();
		intArr[1] = scanner.nextInt();
		intArr[2] = scanner.nextInt();

		Arrays.sort(intArr);
		int allowance = (intArr[2] * 10 + intArr[1]) + intArr[0];

		System.out.println("Allowance = "+ allowance);
	}

}