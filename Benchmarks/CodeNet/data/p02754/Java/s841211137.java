import java.util.*;
import java.io.*; 

public class Main {
	
	public static void main(String... string) {
		Scanner sc = new Scanner(System.in); 
		long n = sc.nextLong();
		long blue = sc.nextLong();
		long red = sc.nextLong();
		long ans = n/(red+blue) * blue; 
		long y = n%(red+blue); 
	    System.out.println(ans + Math.min(blue, y)); 
	}
}