import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws IOException
	{
	   BufferedReader br = new BufferedReader( new InputStreamReader ( System.in));
	   String line= br.readLine();
	   String str1=line.trim();
	   
	   String line1= br.readLine();
	   String str2 = line1.trim();
	   
	   int l1 = str1.length();
	   int l2 = str2.length();
	   
	   String arr[][]= new String[l1+1][l2+1];
	   
	   for(int i=0 ; i<=l2 ; i++)
	     arr[0][i]="";
	    
	   for(int i=0 ; i<=l1 ; i++)
	      arr[i][0]="";
	     
	    for(int i=1 ; i<=l1 ;i++)
	    {
	        char ch=str1.charAt(i-1);
	        for(int j=1; j<=l2 ; j++)
	        {
	            char ch1=str2.charAt(j-1);
	            if(ch1==ch)
	               arr[i][j]= arr[i-1][j-1]+ch ;
	           else
	               {
	                   int k=arr[i-1][j].length();
	                   int m=arr[i][j-1].length();
	                   if(k<m)
	                       arr[i][j]=arr[i][j-1];
	                   else
	                      arr[i][j]=arr[i-1][j];
	               }
	        }
	    }
	    System.out.println(arr[l1][l2]);
	      
	   
		//code
	}
}
