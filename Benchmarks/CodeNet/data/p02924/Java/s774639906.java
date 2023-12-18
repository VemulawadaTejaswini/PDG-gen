import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {


	
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		long n = Long.parseLong(br.readLine());
		
		long res = (n)*(n-1)/2l;
		
		out.println(res);
		
		
		out.flush();
		out.close();
	}
	
	
	


}
