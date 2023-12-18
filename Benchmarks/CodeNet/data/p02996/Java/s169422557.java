

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		pair[] ar=new pair[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=new pair(scan.nextInt(),scan.nextInt());
		}
		Arrays.sort(ar,new compare());
		int curtime=0;
		for(int i=0;i<n;i++)
		{
			curtime+=ar[i].a;
			if(curtime>ar[i].b)
			{
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
class pair{
	int a;int b;
	pair(int x,int y)
	{
		a=x;
		b=y;
	}
}
class compare implements Comparator<pair>
{

	@Override
	public int compare(pair o1, pair o2) {
		if(o1.b>o2.b)
		{
			return 1;
		}else if(o2.b>o1.b)
		{
			return -1;
		}else {
			return 0;
		}
	}
	
}