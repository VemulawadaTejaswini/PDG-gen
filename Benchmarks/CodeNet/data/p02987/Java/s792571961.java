import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
	
		String S = keyboard.next();
		
		String[] ss = S.split("");
		Arrays.sort(ss);
		
		if(ss[0].equals(ss[1]) && ss[2].equals(ss[3])) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		keyboard.close();	
	}
}