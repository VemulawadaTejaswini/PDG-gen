import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String s2 = s.next();
		StringBuffer s3 = new StringBuffer();
		s3.append(s1);
		s3 = s3.reverse();
		String s4 = s3.toString();
		if(s4.equals(s2)){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
}
