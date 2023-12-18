import java.util.Scanner;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		
		String[] array = string.split("");
		int[] array2 = new int[4];
		for(int i=0; i<array.length; i++) {
				array2[i] = Integer.parseInt(array[i]);
		}
		int[] array3 = new int[2];
		int a = (array2[0]*10) + array2[1];
		int b = (array2[2]*10) + array2[3];
		
		if(a > 12 && b > 12 || a==0 && b==0) {
			System.out.println("NA");
		}else if(a < 13 && b < 13 && a!=0 && b!=0) {
			System.out.println("AMBIGUOUS");
		}else if(a > 12 && b<13 && b>0 || a==0 && b<13) {
			System.out.println("YYMM");
		}else if(b > 12 && a<13 && a>0 || b==0 && a<13){
			System.out.println("MMYY");
		}else {
			System.out.println("NA");
		}
	}

}
