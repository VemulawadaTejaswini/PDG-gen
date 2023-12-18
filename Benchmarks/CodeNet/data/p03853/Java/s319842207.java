import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int H  = keyboard.nextInt();
		int W  = keyboard.nextInt();
		
		String[]gazou = new String[2*H];
		
		for(int i = 0; i < H; i++) {
				gazou[2*i] = keyboard.next();
				gazou[2*i+1] = gazou[2*i];
		}
		
		for(int k = 0; k < 2*H; k++) {
				System.out.println(gazou[k]);
		}
		keyboard.close();	
	}
}
