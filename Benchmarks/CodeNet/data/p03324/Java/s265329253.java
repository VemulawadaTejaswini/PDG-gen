import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int n=sc.nextInt();
		double a=0;
		if(n != 100)
		{
			a = n*Math.pow(100,d);
		}
		else
		{
			a = 101*Math.pow(100,d);
		}
		int i = (int)a;
		System.out.print(i);
	}
}