// No sorceries shall prevail. //           
import java.util.*;
import java.io.*;

public class InVoker {
	
	static long gcd(long a, long b) { 
	      if (b == 0) 
	        return a; 
	      return gcd(b, a % b);  
	    }
	static int gcd(int a, int b) { 
	      if (b == 0) 
	        return a; 
	      return gcd(b, a % b);  
	    }
	
	static long mod = 1000000007;
	
	public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		
		String s=inp.next();
		out.println(s.charAt(0)==s.charAt(1) && s.charAt(1)==s.charAt(2)?"No":"Yes");
		
		out.close();
		inp.close();
	}
}
