import java.io.*;
import java.util.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String arr[]=br.readLine().split(" ");
		float a=0;float b=0;float c=0;
		float ti=0;
		a=Float.parseFloat(arr[0]);
		b=Float.parseFloat(arr[1]);
		c=Float.parseFloat(arr[2]);
		ti=a/c;
		//System.out.println(ti);
		if(ti<=b)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	catch(Exception e){}
}}