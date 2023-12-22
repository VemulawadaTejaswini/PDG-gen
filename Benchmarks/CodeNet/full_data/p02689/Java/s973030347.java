import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{	
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String []s=br.readLine().split(" ");
		int N=Integer.parseInt(s[0]);
		int M=Integer.parseInt(s[1]);
		
		int a[][]=new int[N+1][N+1]; 
		int ht[]=new int[N+1];
		boolean flag=false;
		String ans="";
		int c=0;
		
		s=br.readLine().split(" ");
		
		for(int j=1;j<=N;j++)
			ht[j]=Integer.parseInt(s[j-1]);
			
		for(int j=0;j<M;j++)
		{
			s=br.readLine().split(" ");
			int x1=Integer.parseInt(s[0]);
			int x2=Integer.parseInt(s[1]);
			
			a[x1][x2]=1;
			a[x2][x1]=1;
		}
			
		
		//checking algo
		int num=N;
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=N;j++)
			{
				if(ht[i]<=ht[j] && a[i][j]==1)
				{
					num--;
					break;
				}				
			}
		}
		
		out.println(num);
		
	}
	
	
}


