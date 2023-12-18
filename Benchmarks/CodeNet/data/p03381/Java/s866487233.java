import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		int centerValue = inputNum / 2;
		String[] arrayStr = input.split(" ");
		int[] arrayInt = new int[arrayStr.length];
		int[] arrayIntCopy = new int[arrayStr.length];
		for(int i = 0 ; i < arrayStr.length ; i++) {
			arrayInt[i] = Integer.parseInt(arrayStr[i]);
			arrayIntCopy[i] = Integer.parseInt(arrayStr[i]);
		}
		for(int i = 0 ; i < arrayStr.length ; i++) {
			arrayInt[i] = 0;
			Arrays.sort(arrayInt);
			System.out.println(arrayInt[centerValue]);
			System.arraycopy(arrayIntCopy, 0, arrayInt, 0, arrayInt.length);
		}
		sc.close();
	}
}