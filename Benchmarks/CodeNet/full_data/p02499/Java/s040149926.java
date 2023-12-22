import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char count;
		int i = 0;
		int moji[] = new int[256];
		
		while (sc.hasNextLine()) {
		 	String line = sc.nextLine();
       	    		for (int i= 0; i < line.length(); i++){
			        char ch= Character.toLowerCase(line.charAt(i));
			        chars[ch] = chars[ch] + 1;
 			}
       		}
        
        	for(ch= 'a'; ch <= 'z'; ch++){
	        	System.out.println(count + " : "+ moji[i]);
	        }

	}
}