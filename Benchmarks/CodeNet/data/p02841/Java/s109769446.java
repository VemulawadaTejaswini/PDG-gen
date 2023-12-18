import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int m1=in.nextInt();
		int d1=in.nextInt();
		int m2=in.nextInt();
		int d2=in.nextInt();
		if(d2==1&&m1+1==m2)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
	}
}
	