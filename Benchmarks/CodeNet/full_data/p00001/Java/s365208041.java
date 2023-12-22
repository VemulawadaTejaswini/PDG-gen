
import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class Main
{
	public static void main (String[] arg)
	{
		int[] a=new int[4];
		Scanner in = new Scanner(System.in);
		for(int i=0 ; i<10 ;i++)
		{
			int x = in.nextInt();
			for(int j=0; j<2;j++)
			{
				if(a[j] < x)
				{	
					a[j+1]=a[j];
					a[j] = x;
					
					break;
				}
			}
		}
		for(int i=0 ; i<3 ;i++)
		{
		System.out.println(a[i]);
		}
	}
}