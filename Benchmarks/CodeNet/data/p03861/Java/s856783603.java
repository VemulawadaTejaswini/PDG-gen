import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		long a  = keyboard.nextLong();
		long b  = keyboard.nextLong();
		long x  = keyboard.nextLong();
		
		System.out.println(b/x - (a-1)/x);
		keyboard.close();	
	}
}