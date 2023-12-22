import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] in = input.split(" ");
		int num1 = Integer.parseInt(in[0]);
		int num2 = Integer.parseInt(in[1]);
		int num3 = Integer.parseInt(in[2]);
		if (num1 >= 1 && num1 <= 10000 && num2 >= 1 && num2 <= 10000 && num3 >= 1 && num3 <= 10000){
			int[] sortNum = new int[3];
			sortNum[0] = num1;
			sortNum[1] = num2;
			sortNum[2] = num3;
			Arrays.sort(sortNum);
			for (int out : sortNum) {
				System.out.print(out + " ");
			}
		}
	}
}