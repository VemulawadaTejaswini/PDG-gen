import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int H  = keyboard.nextInt();
		int W = keyboard.nextInt();
		int h  = keyboard.nextInt();
		int w = keyboard.nextInt();

		System.out.println(H*W -(h*W+w*H-h*w));
		keyboard.close();	
	}
}