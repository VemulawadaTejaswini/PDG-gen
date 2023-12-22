import java.util.Arrays;
import java.util.Scanner;


public class SortingFiveNumbers {

	public static void main(String[] a){
		
		int inputCount = 5;
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] numArray = input.split(" ");
		
		
		int[] temp = new int [inputCount];
		for (int i=0; i<inputCount; i++){
			temp[i] = Integer.parseInt(numArray[i]);
		}

		Arrays.sort(temp);
		
		System.out.println(temp[4] + " " +
						   temp[3] + " " +
						   temp[2] + " " +
						   temp[1] + " " +
						   temp[0]);
	}
}