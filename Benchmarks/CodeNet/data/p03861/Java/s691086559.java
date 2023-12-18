import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		long a  = keyboard.nextLong();
		long b  = keyboard.nextLong();
		long x  = keyboard.nextLong();
		
		if(a%x == 0) {
			System.out.println(b/x - a/x + 1);
		}else {
			System.out.println(b/x - a/x);
		}
	
		keyboard.close();	
	}
}