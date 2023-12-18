import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] first = splitInt(sc.nextLine(), " ");
		int result = (3*first[0] + first[1])/2;
		System.out.println(result);
		
	}
	public static int[] splitInt(String str, String split) {
		String[] array = str.split(split);
		int[] array2 = new int[array.length];
	
		for(int i=0; i<array.length; i++) {
				array2[i] = Integer.parseInt(array[i]);
		}
		return array2;
	}
}