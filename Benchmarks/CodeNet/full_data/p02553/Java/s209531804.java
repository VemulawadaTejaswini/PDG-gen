import java.util.*;
import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String arr[]=br.readLine().split(" ");
		long ans=0;
		long h=0;long p=0;
		h=Math.max(Long.parseLong(arr[0])*Long.parseLong(arr[2]),Long.parseLong(arr[0])*Long.parseLong(arr[3]));
		p=Math.max(Long.parseLong(arr[1])*Long.parseLong(arr[2]),Long.parseLong(arr[1])*Long.parseLong(arr[3]));
		ans=Math.max(h,p);
		System.out.println(ans);
		}
	catch(Exception e){}
}}