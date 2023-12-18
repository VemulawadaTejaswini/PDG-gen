import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		long X  = keyboard.nextLong();
		long Y  = keyboard.nextLong();
		
		long ANS = 0;
		
		while(X<=Y) {
			X *=2;
			ANS++;
		}
		
		System.out.println(ANS);
		keyboard.close();	
	}
}