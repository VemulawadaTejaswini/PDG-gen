import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main
{
	public static void main(String args[]) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		int a = 2*X - (Y/2);

		int flag = 0;

		if(Math.ceil(a) == Math.floor(a) && a >= 0)
			flag = 1;
		else
			flag = 0;

		if(flag == 1)
			out.println("Yes");
		else
			out.println("No");
		
		out.flush();
	}
}