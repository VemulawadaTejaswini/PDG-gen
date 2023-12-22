import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long a = Long.parseLong(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		long b1 = (long)(b*100); 
		System.out.println((a*b1)/100);
	}
}