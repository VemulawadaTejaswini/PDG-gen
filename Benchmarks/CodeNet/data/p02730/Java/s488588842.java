import java.util.*;

public class Main {

	// test 2 B - String Palindrome
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		int lenInput = input.length();
		
		String str1 = input.substring(0,(lenInput-1)/2);
		String str2 = input.substring((lenInput+1)/2, lenInput);

		
        StringBuffer strb = new StringBuffer(input);
        StringBuffer str1b = new StringBuffer(str1);
 //       StringBuffer str2b = new StringBuffer(str2);
   
        String strr = strb.reverse().toString();
        String str1r = str1b.reverse().toString();
        
        boolean strong = false;
        
        if (strr.equals(input)) {
        	if(str1r.equals(str1)) {
        		if (str1.equals(str2)){
        			strong = true;
        		}
        	}
        }
        
		log( strong ? "yes" : "no"); 
		sc.close();
	}

	static void log(String s) {
		System.out.println(s);
	}
	
}
