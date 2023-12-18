import java.util.*;
import java.io.*; 

public class Main {
	
	public static void main(String... string) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int blue = sc.nextInt();
		int red = sc.nextInt();
		if(blue == 0) blue = 0; 
		else if(red == 0) blue = n; 
		else {
			blue = n - red; 
		}
		System.out.println(blue); 
		
	}
}