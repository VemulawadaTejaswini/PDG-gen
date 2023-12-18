import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
    	int k=x.nextInt();
		int r=x.nextInt();
		for(int i=r-(k-1);i<r+k;i++)
		{
			System.out.print(i+" ");
		}
	}
}