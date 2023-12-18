import java.util.Scanner;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = splitInt(sc.nextLine(), " ");
		int times = array[2]/array[0];
		System.out.println(array[1]*times);
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
