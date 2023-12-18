import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 String[] str = new String[6];
		 for(int i =0;i<6;i++) {
	       str[i] = scan.nextLine();
		 }
		 if(str[2].equals(str[3]) || str[4].equals(str[5])) {
			 System.out.print("Yes");
		 }
		 else {
			 System.out.print("No");
		 }

	}
}