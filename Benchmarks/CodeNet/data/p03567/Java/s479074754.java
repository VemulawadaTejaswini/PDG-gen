import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		boolean ac = false;
		for(int i = 0; i < S.length() - 1; i++){
		    if(S.charAt(i) == 'A' && S.charAt(i + 1) == 'C') ac = true;
		}
		System.out.println(ac?"Yes":"No");
	}
}