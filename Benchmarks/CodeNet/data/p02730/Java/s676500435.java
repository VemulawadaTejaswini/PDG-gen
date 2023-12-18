
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    
    static boolean isPalin(String s){
        int i=0;
        int j=s.length()-1;
        
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		String s = input.next();
		
		boolean b1 = isPalin(s);
		boolean b2 = isPalin(s.substring(0,(s.length()-1)/2));
		boolean b3 = isPalin(s.substring((s.length()+3)/2-1));
		
		if(b1&&b2&&b3) System.out.println("Yes");
		else System.out.println("No");
	}
}
