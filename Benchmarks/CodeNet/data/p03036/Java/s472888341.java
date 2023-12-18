import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int r  = keyboard.nextInt();
		int D  = keyboard.nextInt();
		int X0  = keyboard.nextInt();
		
		int ans = 0;
		int G = X0;
		
		for(int i = 1; i < 11 ; i++) {
			ans = r * G - D;
			System.out.println(ans);
			G = ans;
		}
		
		keyboard.close();	
	}
}