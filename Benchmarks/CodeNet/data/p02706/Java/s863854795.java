import java.math.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
		String s[]=bu.readLine().split(" ");
		int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]),i,sum=0;
		s=bu.readLine().split(" ");
		for(i=0;i<m;i++)
		{
			int k=Integer.parseInt(s[i]);
			sum+=k;
		}
		if(sum>n) System.out.print(-1);
		else System.out.print(n-sum);
	}
}