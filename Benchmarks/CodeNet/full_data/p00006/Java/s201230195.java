import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
    	String str = scan.next();

    	String[] strArraySub = str.split("");
    	int sval;
    	int val = strArraySub.length;
    	//System.out.println(val);
    	for (int i = 1; i <= val; i++) {
    		// "strArraySub"???1??????????????¨???
    		sval = val - i;
    		System.out.print(strArraySub[sval]);
    		
		}System.out.println("");
 
	}
}