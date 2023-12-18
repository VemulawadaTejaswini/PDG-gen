import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a = in.nextInt();

			int remain = n / 500;
			int ans = a - remain;
			if(ans >= 0)
				System.out.println("YES");
			else
				System.out.println("NO");
}}