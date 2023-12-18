

import java.util.*;
import java.io.*;


public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		 int a=0;
		 int b=0;
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)=='A')
			 {
				 a++;
			 }
			 else if(s.charAt(i)=='B')
			 {
				 b++;
			 }
			 
		 }
		 
		 
		 
		 
		 if((a>1||b>1) && (a!=s.length() && b!=s.length()))
		 {
			 System.out.println(" Yes ");
		 }
		 else
		 {
			 System.out.println(" No ");
		 }
		
		
	}



	}







