

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		if(Character.isUpperCase(c.charAt(0))) System.out.println("A");
		else System.out.println("a");
	}
}
