import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		//StringTokenizer st = new StringTokenizer(br.readLine());
		String s="";
		while(n>0)
		{
			int x = (int)n%26;
			n = n/26;
			s=s+(char)(97+x-1);
		}
		for(int i=s.length()-1;i>=0;i--)
			System.out.print(s.charAt(i));
		System.out.println();
	}
}