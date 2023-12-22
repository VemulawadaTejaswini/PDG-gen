import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long a = Long.parseLong(st.nextToken());
		String b = (st.nextToken());
		long b1 = Long.parseLong(b.substring(0,b.indexOf('.'))+b.substring(b.indexOf('.')+1));
		//System.out.println(b1); 
		System.out.println((a*b1)/100);
	}
}