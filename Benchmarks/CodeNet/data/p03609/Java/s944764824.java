import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int t = sc.nextInt();
		System.out.println((X - t >= 0) ? (X - t) : 0);
	}
}