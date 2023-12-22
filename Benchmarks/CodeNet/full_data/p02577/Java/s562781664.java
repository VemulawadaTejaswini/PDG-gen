 
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 public class Main
 {
 	public static void main(String[]args)
 	{
 		Scanner sc=new Scanner (System.in);
 		//int t=sc.nextInt();
 		String str=sc.next();
 		int n=str.length();
 		int i,temp=0;
 		for(i=0;i<n;i++)
 		{
 			
 			String s=str.substring(i,i+1);
 			int x=Integer.parseInt(s);
 			temp=temp+x;
 		}
 		if(temp%9==0)System.out.println("Yes");
 		else System.out.println("No");
 	}
 }