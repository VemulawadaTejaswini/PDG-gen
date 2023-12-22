import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		
		int ans = 0;
		
		if((1000-N%1000) != 1000) {
			ans = 1000-N%1000;
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}
