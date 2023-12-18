import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		int N=Integer.parseInt(in.readLine());
		String str=in.readLine();
		String starr[]=str.split("");
		int i,j;
		for(i=1;i<=N;i++)
		{
		    for(j=0;j<N;j++)
		    {
		        if(Integer.parseInt(starr[j])==i)
		        {
		            System.out.print((j+1)+" ");
		        }
		    }
		}
		
	}
}