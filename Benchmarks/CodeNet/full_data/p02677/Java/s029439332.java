import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int Ht = 30 * H;
		int Mt = 6 * M;
		int theta;
		
		if(Math.max(Ht, Mt) == Ht)
		{
			theta = Ht - Mt;
		}
		else
		{
			theta = Mt - Ht;
		}
		
		if(theta > 180)
		{
			theta = 360 - theta;
		}
		
		System.out.println(theta);
		
		if(theta == 180)
		{
			System.out.println((double)(A + B));
		}
		else
		{
			System.out.println(Math.sqrt(A*A + B*B - 2*A*B*Math.cos(Math.toRadians(theta))));
		}
	}
}
