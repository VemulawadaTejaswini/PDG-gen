import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] inputArray = input.split("");
		int countRight = 0;
		int countLeft = 0;
		int res = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].equals("<")) {
				res += countLeft + (countLeft - 1);
				countLeft = 0;
				countRight++;
			} else {
				res += countRight + (countRight + 1);
				countRight = 0;
				countLeft++;
			}
		}
		System.out.print(res);
	}
}
