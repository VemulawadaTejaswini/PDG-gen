import java.util.*;
public class Main
{
	static boolean visit[];
	static Point p[];
	static int cnt;
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int max=0;
			p=new Point[n];
			visit=new boolean[n];
			
			for(int i=0;i<n;i++)
			{
				String s[]=in.next().split(",");
				p[i]=new Point(Double.valueOf(s[0]),Double.valueOf(s[1]));
			}
			for(int i=0;i<n;i++)
			{
				cnt=0;
				if(!visit[i])
				{
					solve(i);
					max=Math.max(max,cnt);
				}
			}
			System.out.println(max);
		}
	}

	static void solve(int index)
	{
		visit[index]=true;
		cnt++;
		for(int i=0;i<visit.length;i++)
		{
			if(!visit[i])
			{
				double d=Math.hypot(p[index].x-p[i].x,p[index].y-p[i].y);
				if(d<=2)
					solve(i);
			}
		}
	}
}
class Point
{
	double x;
	double y;
	Point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
}