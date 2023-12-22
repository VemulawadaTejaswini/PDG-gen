
import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class Main
{
	public static void main (String[] arg)
	{
		int[] a=new int[10];
		Scanner in = new Scanner(System.in);
		for(int i=0 ; i<10 ;i++)
		{
			a[i] = in.nextInt();
			
		}
		Arrays.sort(a);
		for(int i=9 ; i>6 ;i--)
		{
		System.out.println(a[i]);
		}
	}
}