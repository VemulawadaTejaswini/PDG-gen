/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		while(!str.equals(".")){
			if(is(str))
				System.out.println("yes");
			else
				System.out.println("no");
			str = in.nextLine();
		}
	}

	public static boolean is(String input){
		char c;
		String str = "";
		for(int i = 0;i < input.length();i++){
			c = input.charAt(i);
			switch(c){
			case '(':
				str = ")" + str;
				break;
			case '[':
				str = "]" + str;
				break;
			case ')':
			case ']':
				if(str.isEmpty())
					return false;
				if(str.charAt(0) == c)
					str = str.substring(1);
				else
					return false;
				break;
			}
		}
		return str.isEmpty();
	}
}