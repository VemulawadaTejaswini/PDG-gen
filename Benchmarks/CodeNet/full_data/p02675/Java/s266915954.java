import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{	
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String ans="";
		//int c=0;
		
		String s=br.readLine();
		int n=s.length();
		int x=s.charAt(n-1)-'0';
		
		if(x==2 || x==4 || x==5 || x==7 || x==9)
			ans="hon";
		else if(x==0|| x==1 ||x==6 ||x==8)
			ans="pon";
		else
			ans="bon";
		
		out.println(ans);
		
	}
	
	
}


