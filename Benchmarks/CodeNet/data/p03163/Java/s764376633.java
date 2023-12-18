import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int w=s.nextInt();
	Pair p[]=new Pair[n];
	long dp[][]=new long[n][w+1];
	for(int i=0;i<n;i++)
	p[i]=new Pair(s.nextInt(),s.nextLong());
	Compare obj=new Compare();
	obj.compare(p,n);
	for(int i=0;i<w+1;i++)
	{
	if(i<p[0].x)
	dp[0][i]=0;
	else
	dp[0][i]=p[0].y;
	}
	for(int i=1;i<n;i++)
	{
	for(int j=0;j<w+1;j++)
	{
	if(j<p[i].x)
	dp[i][j]=dp[i-1][j];
	else
	dp[i][j]=Math.max(p[i].y+dp[i-1][j-p[i].x],dp[i-1][j]);
	}	
	}
	/*for(int i=0;i<n;i++)
	System.out.println(p[i].x+" "+p[i].y+" ");
	for(int i=1;i<n;i++)
	{
	for(int j=0;j<w+1;j++)
	System.out.print(dp[i][j]+" ");
	System.out.println();
	}*/
	System.out.println(dp[n-1][w]);
}
}
class Pair
{
	int x;
	long y;
	public Pair(int a,long b)
	{
	x=a;
	y=b;
	}
}
class Compare
{
	static void compare(Pair arr[],int n)
	{
	Arrays.sort(arr,new Comparator<Pair>(){
	public int compare(Pair p1,Pair p2)
	{
	return p1.x-p2.x;
	}
	});
	}
}  