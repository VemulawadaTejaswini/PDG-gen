import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String W = sc.next();
		int count = 0;
		
		while(true){
			String T = sc.next();
			if(T.equals("END_OF_TEXT")) break;
			if(T.equals(W)) count++;
		}
		System.out.println(count);
	}
}
