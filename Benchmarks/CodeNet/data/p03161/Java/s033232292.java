import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) throws IOException
	{
	   BufferedReader br = new BufferedReader( new InputStreamReader ( System.in));
	   String line1= br.readLine();
	   String strs1[]= line1.trim().split("\\s+");
	   int n= Integer.parseInt( strs1[0] );
	   int k= Integer.parseInt(strs1[1]);
	   
	   int arr[]= new int[n];
	   
	   String line=br.readLine();
	   String strs[]=line.trim().split("\\s+");
	   
	   for(int i=0; i<n ;i++)
	   arr[i]=Integer.parseInt(strs[i]);
	   
	   int calc[]=new int[n];
	   calc[0]=0;
	   
	   for(int i=1;i<n ; i++)
	   {
	       int m= calc[i-1] + Math.abs(arr[i]-arr[i-1] );
	       int count=1;
	       for(int j=i-2 ; j>=0 && count<k ; j--)
	       {
	           int comp=calc[j] + Math.abs(arr[j]-arr[i]);
	           count+=1;
	           m=Math.min(m , comp);
	       }
	       
	       calc[i]=m;

	   }
	   System.out.println( calc[n-1]);
		//code
	}
}