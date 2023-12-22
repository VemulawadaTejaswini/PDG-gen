import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
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