
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String []s=br.readLine().split(" ");
		
		int A=Integer.parseInt(s[0]);
		int B=Integer.parseInt(s[1]);
		
		if(B>A)
		{
			int x = B%(A-1);
			int y = B/(A-1);
			if(x<=1)
				System.out.println(y);
			else
				System.out.println(y+1);
		}
		
		else
			System.out.println(1);
	}
}


