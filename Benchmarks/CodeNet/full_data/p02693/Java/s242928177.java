import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{	
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		long K=Long.parseLong(br.readLine());
		String []s=br.readLine().split(" ");
		long A=Long.parseLong(s[0]);
		long B=Long.parseLong(s[1]);
		boolean flag=false;
		String ans="";
		
		for(long i=A;i<=B;i++)
		{
			if(i%K == 0)
			{
				flag=true;
				break;
			}
		}
		
		if(flag==true)
			ans="OK";
		else
			ans="NG";
			
		out.println(ans);
		
	}
	
	
}


