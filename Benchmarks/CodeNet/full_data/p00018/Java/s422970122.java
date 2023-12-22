import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] a){
		
		int inputCount = 5;
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] numArray = input.split(" ");
		
		if (numArray.length == inputCount){
			try{
				Integer[] outputSeq = new Integer [inputCount];
				for (int i=0; i<inputCount; i++){
					outputSeq[i] = Integer.parseInt(numArray[i]);
				}
				Arrays.sort(outputSeq, Collections.reverseOrder());
				for (int i: outputSeq){
					System.out.print(i + " ");
				}
			} catch (NumberFormatException e){
			}
		}
		
	}
}