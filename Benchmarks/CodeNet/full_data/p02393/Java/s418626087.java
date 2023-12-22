import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String num = stdin.nextLine();			
                String[] input = num.split(" ");
			if (input.length == 3) {
				int num1 = (Integer.parseInt(input[0]));
				int num2 = (Integer.parseInt(input[1]));
				int num3 = (Integer.parseInt(input[2]));
				if (num1 > 0 && num1 < 10001 && num2 > 0 && num2 < 10001 && num3 > 0 && num3 < 10001) {
					int[] numbers = new int[input.length];
					for (int i = 0; i < input.length; i++) {
						numbers[i] = Integer.parseInt(input[i]);
					}
					Arrays.sort(numbers);
					System.out.println(Arrays.toString(numbers));
				}
			}
	}
}