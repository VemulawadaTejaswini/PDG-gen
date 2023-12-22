import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
			int n=in.nextInt();//家の数
			int k=in.nextInt();//発電機
			int a[]=new int[n];//家の位置
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			if(k==1)
			{
				System.out.println(a[n-1]-a[0]);
			}
		}
	}
	
	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
	}
}