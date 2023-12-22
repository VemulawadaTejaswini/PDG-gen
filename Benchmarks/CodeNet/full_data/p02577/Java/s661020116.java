import java.util.*;

public class Main {
public static void main(String[] args) {

			Scanner keyboard = new Scanner(System.in);

			 String S = keyboard.next();
			 long sum = 0;
			 String ans = "No";
			 		
			for (int s=0; s<S.length(); s++) {
				sum += (long)S.charAt(s)-48;
			}			
		
			if(sum%9 == 0) {
				ans = "Yes"; 
			}
		
		System.out.println(ans);
		keyboard.close();	
	}
}
