import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    char[] chars = s.toCharArray();
	    for(char c : chars) {
	        if(c=='1') {
	            System.out.print(9);
	        } else {
	            System.out.print(1);
	        }
	    }
	    
	    
	}
}
