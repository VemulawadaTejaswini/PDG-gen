/*
 *           AUTHOR: Maria Theresa M. Padayhag
 *             DATE: 20160326
 *  PRE-REQUIREMENT: JDK 1.8
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
	public static boolean isPalindrome(String input)
	{
		StringBuilder sb = new  StringBuilder(input);
        if(input.equals(sb.reverse().toString()))
			return true;
        else
			return false;
	}
	
	public static void main( String args[] ) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input;
		ArrayList<String> list = new ArrayList<String>();
		
		READ: 
		while( ( input = br.readLine() ) != null && input.length() !=0 ) {
			if(isPalindrome(input))
				list.add(input);					
		}
		
		System.out.println(list.size());
	}
}