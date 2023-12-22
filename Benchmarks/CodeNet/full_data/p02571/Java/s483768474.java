import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String S = s.next();
	String T = s.next();
	
	int max = T.length();
	for(int i = 0; i <= S.length()-T.length(); i++){
		int count = T.length();
		for(int j = 0; j < T.length(); j++){
			if(S.charAt(i+j)==T.charAt(j)) count--;
		}
		max = Math.min(count, max);
	}
		
	System.out.println(max);
	
	
	

    
  }
}