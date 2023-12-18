import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		int count = 1;
		char c = N.charAt(0);
		
		for(int i = 1; i < 4; i++){
			if(N.charAt(i) == c){
				count++;
				if(count == 3){
					System.out.println("Yes");
					return;
				}
			} else {
				count = 1;
				c = N.charAt(i);
			}
		}
		
		System.out.println("No");
	}
}