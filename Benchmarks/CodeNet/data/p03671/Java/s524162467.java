import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a >= b && a >= c) System.out.println(b + c);
		else if(b >= a && b >= c) System.out.println(a + c);
		else System.out.println(a + b);
	}
}