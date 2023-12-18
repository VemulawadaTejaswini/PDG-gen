import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String r2 = new StringBuilder(sc.next()).reverse().toString();
		
		System.out.println(s1.equals(r2) ? "YES" : "NO");
	}
}