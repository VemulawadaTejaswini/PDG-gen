import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=(int)(n/1.08);		
		while((m+1)*1.08<(n+1))
		{
			m++;
		}
		if((int)(m*1.08)==n)
		{
			System.out.println(m);
		}
		else
		{
			System.out.println(":(");
		}
			
	}
}
	