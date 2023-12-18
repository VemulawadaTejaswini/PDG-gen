import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int q=sc.nextInt();
    String s=sc.next();
     
    for(int k=0;k<q;k++)
    { 
    	int count=0,maxcount=0;
    	int left=sc.nextInt();
    	int right=sc.nextInt();
    	for(int i=left-1;i<(right-1);i++)
    	{
    		if(s.charAt(i)=='A' && s.charAt(i+1)=='C' )
    		{
    			count++;
    		}

    	}
    	System.out.println(count);
    }

    
   }

 }
    
