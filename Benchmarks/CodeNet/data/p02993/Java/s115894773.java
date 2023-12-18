import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String S  = keyboard.next();
		String[] pass = S.split("");
        
        String ans = "Good";
        for(int i = 0; i < S.length()-1; i++){
	        if(pass[i].equals(pass[i+1])){
	        	ans = "Bad";
			}
		}

		System.out.println(ans);
		keyboard.close();	
	}
}
