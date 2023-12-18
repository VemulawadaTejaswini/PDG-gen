import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int A = keyboard.nextInt();
		int B = keyboard.nextInt();
		
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		
		p1 = A + (A - 1);
		p2 = A + B;
		p3 = B + (B - 1);
		
		int[] ArrayX = {p1, p2, p3};
		Arrays.sort(ArrayX);

			System.out.println(ArrayX[2]);
			
		keyboard.close();	
	}
}