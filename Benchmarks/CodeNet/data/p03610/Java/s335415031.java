import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String ss = "";
		for(int i = 0; i < s.length(); i++){
			if(i % 2 == 0) ss += s.charAt(i);
		}
		System.out.println(ss);
	}
}