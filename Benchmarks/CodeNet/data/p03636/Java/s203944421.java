import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		System.out.println("" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length()-1));
	}
}