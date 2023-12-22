import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			LinkedList<Integer> LL=new LinkedList<Integer>();
			int sum=0;
			boolean judge=false;
			for(int i=0;i<n;i++)
			{
				int a=in.nextInt();
				LL.add(a);
				sum+=a;
			}
			for(int i=1;i<=1000000;i++)
			{
				if((i*(i+1))/2==sum)
				{
					judge=true;
					break;
				}
			}
			if(!judge)
			{
				System.out.println(-1);
				continue;
			}
			int cnt=0;
			for(;;)
			{
				int v[]=new int[LL.size()];
				for(int i=0;i<v.length;i++)
					v[i]=LL.get(i);
				if(cnt>10000)
					break;
				//debug(v);
				if(LL.get(0)==1)
					if(check(v))
						break;
				int block=0;
				for(int i=0;i<v.length;i++)
				{
					block++;
					v[i]--;
				}
				LL=new LinkedList<Integer>();
				for(int i=0;i<v.length;i++)
				{
					if(v[i]!=0)
						LL.add(v[i]);
				}
				cnt++;
				LL.add(block);
			}
			System.out.println(cnt>10000 ? -1:cnt);
		}
	}

	static boolean check(int v[])
	{
		boolean res=true;
		for(int i=0;i<v.length-1;i++)
		{
			if(v[i]+1!=v[i+1])
				res=false;
		}
		return res;
	}
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}