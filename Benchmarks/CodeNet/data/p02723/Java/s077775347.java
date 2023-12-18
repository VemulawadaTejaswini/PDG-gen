import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main {
    public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 System.out.println(myFunction(a));
	}
	
	public static int myFunction(int s) {
		int total = 0;
		total += s/500 * 1000;
		s %= 1000;
		total += s/5 *5;
		
		return total;
    }
}

/*
StringBuilder longestString = new StringBuilder();
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++ ) {
            String charAtI = String.valueOf(s.charAt(i));
            int val = longestString.indexOf(String.valueOf(charAtI));
            longestString.append(charAtI);
            if (val != - 1) {
                maxLength = Math.max(maxLength, longestString.length());
                longestString = new StringBuilder(longestString.substring(val));
            }
            
            i++;
        
*/