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
		int H = Integer.parseInt(s[0]);
		int A = Integer.parseInt(s[1]);
		
				
		if(H%A!=0)
			out.println((H/A)+1);
		else
			out.println((H/A));
	
	}
}


