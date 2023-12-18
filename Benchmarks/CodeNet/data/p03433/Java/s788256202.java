import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);

			int n = in.nextInt();
			int a = in.nextInt();

			int mo = n % 500;
			int r = a - mo;
			if(r >= 0)
				System.out.println("Yes");
			else
				System.out.println("No");
}}