
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a <= b)
		{
			if(b <= c)
			{
				System.out.println("Yes");
			}else{
				System.out.println("No");	
			}
		}
	}
}