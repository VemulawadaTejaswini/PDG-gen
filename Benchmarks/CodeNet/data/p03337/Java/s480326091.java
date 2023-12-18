import java.util.*;

public class Main {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 int a = scan.nextInt();
		 int b = scan.nextInt();
		 
		 int A = Math.abs(a + b);
		 int B = Math.abs(a - b);
		 int C = Math.abs(a * b);
		 int x = Math.max(A, B);
		 System.out.println(Math.max(x, C));
		
	}
}