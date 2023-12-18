import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] first = splitInt(sc.nextLine(), " ");
		String[] table = new String[first[0]];
		
		for(int i=0; i<first[0]; i++) {
			table[i] = sc.nextLine();
		}
		Arrays.sort(table);
		for(String t:table) {
			 System.out.println(t);
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