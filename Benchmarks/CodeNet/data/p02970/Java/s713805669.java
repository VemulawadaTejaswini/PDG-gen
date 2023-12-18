

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 int D = scan.nextInt();
		 int result;
		 
		 if (N % (2 * D + 1) == 0) {
			 result = N / (2 * D + 1);
		 } else {
			 result = N / (2 * D + 1) + 1;
		 }
		 
		 
		 System.out.println(result);
		 scan.close();
	}

}
