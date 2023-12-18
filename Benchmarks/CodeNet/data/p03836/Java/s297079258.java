import java.io.*;
import java.util.*;
import java.math.*;
import java.util.concurrent.ThreadLocalRandom;
public class Main 
{
	
	static long gcd(long a, long b) 
	{
		if (b == 0)
		{	
			return a;
		}
		
		else
		{
			 return gcd(b, a % b);
		}
	}
	public static void main(String[] args) throws Exception
	{

		
		   PrintWriter out = new PrintWriter(System.out);
		   Scanner in = new Scanner(System.in);
		 // long n , k , q;
		  
	int x = in.nextInt();
	int y = in.nextInt();
	int xx = in.nextInt();
	int yy= in.nextInt();
	if( x  > xx  ) for(int i = 0; i < Math.abs(xx  - x);i++)out.print("L");
	else for(int i = 0; i < Math.abs(xx  - x);i++)out.print("R");
	if( y  > yy  ) for(int i = 0; i < Math.abs(yy  - y);i++)out.print("D");
	else for(int i = 0; i < Math.abs(yy  - y);i++)out.print("U");
	if( x  < xx  ) for(int i = 0; i < Math.abs(xx  - x);i++)out.print("L");
	else for(int i = 0; i < Math.abs(xx  - x);i++)out.print("R");
	if( y  < yy  ) for(int i = 0; i < Math.abs(yy  - y);i++)out.print("D");
	else for(int i = 0; i < Math.abs(yy  - y);i++)out.print("U");
	if( x  < xx  ) out.print("L");
	else out.print("R");
	if( y  > yy  ) for(int i = 0; i < Math.abs(yy  - y) + 1;i++)out.print("D");
	else for(int i = 0; i < Math.abs(yy  - y ) + 1;i++)out.print("U");
	if( x  > xx  ) for(int i = 0; i < Math.abs(xx  - x ) + 1;i++)out.print("L");
	else for(int i = 0; i < Math.abs(xx  - x ) + 1;i++)out.print("R");
	if( y  > yy  ) out.print("U");
	else out.print("D");
	
	if( x  < xx  ) out.print("R");
	else out.print("L");
	if( y  > yy  ) for(int i = 0; i < Math.abs(yy  - y) + 1;i++)out.print("U");
	else for(int i = 0; i < Math.abs(yy  - y ) + 1;i++)out.print("D");
	if( x  > xx  ) for(int i = 0; i < Math.abs(xx  - x ) + 1;i++)out.print("R");
	else for(int i = 0; i < Math.abs(xx  - x ) + 1;i++)out.print("L");
	if( y  > yy  ) out.print("D");
	else out.print("U");
	   out.close();
	}
}