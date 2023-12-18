import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int h = keyboard.nextInt();
		
			System.out.println((a + b) * h / 2);
			
		keyboard.close();	
	}
}
