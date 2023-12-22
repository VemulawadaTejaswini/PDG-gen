import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String z = br.readLine();
		int c=0;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)!=z.charAt(i))
				c++;
		System.out.println(c);
	}
}