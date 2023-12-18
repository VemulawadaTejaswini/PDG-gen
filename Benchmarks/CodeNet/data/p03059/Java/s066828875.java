import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int A = keyboard.nextInt();
		int B = keyboard.nextInt();
		int T = keyboard.nextInt();
		
			System.out.println((T / A) * B);
			
		keyboard.close();	
	}
}
