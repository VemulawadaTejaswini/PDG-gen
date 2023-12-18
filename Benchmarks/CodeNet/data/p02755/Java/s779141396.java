import java.util.*;
import java.io.*; 

public class Main {
	
	public static void main(String... string) {
		Scanner sc = new Scanner(System.in); 
		int x = sc.nextInt()*100; 
		int y = sc.nextInt()*10; 
		int ans = (x-y)/7;
		if((int)(ans * 0.08) == x/100 && (int)(ans * 0.1) == y/10) 
		  System.out.println((x-y)/7); 
		else System.out.println(-1); 
	}
}