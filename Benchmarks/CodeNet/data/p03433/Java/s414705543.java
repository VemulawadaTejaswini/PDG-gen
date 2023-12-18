import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args)
	{
		
			Scanner in = new Scanner(System.in);

			int n = in.nextInt();
			int a = in.nextInt();

			if(n < 500 && a >= n)
				System.out.println("YES");
			else if(n < 500 && a < n)
				System.out.println("NO");

			else if(n >= 500 && n % 500 == 0)
				System.out.println("YES");

			else if(n >= 500 && n % 500 != 0)
			{
				int t = n % 500;
				int re = a - t;
				if(re >= 0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
}}