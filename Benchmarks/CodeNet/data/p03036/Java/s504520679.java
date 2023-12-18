import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = splitInt(sc.nextLine(), " ");
		int[] result = new int[10];
		result[0] = array[0]*array[2]-array[1];
		for(int i=1; i<10; i++) {
			result[i] = result[i-1]*array[0]-array[1];
		}
		for(int a:result) {
			System.out.println(a);
		}
		
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