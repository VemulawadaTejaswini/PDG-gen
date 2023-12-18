import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{	
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String []s=br.readLine().split(" ");
		
		long N=Long.parseLong(br.readLine());
		//long W=Long.parseLong(s[1]);
		
		HashSet<String> set = new HashSet<String>();
		for(int i=0;i<N;i++)
			set.add(br.readLine());
		
		out.println(set.size());
		
	}
	
	
}


