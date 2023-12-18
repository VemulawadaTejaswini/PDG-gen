import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a = in.nextInt();

			if(n < 500 && n <= a)
				System.out.println("YES");
                        else if(n < 500 && n > a)
                                System.out.println("NO");
			else
			{
				int remain = n / 500;
				int ans = a - remain;
				if(ans >= 0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
}}