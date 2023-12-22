import java.util.Arrays;
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
			int a[]=new int[n];//パイプ
			int b[]=new int[n-1];//ジョイント
			int j[]=new int[n-1];
			long ans=0;
			long sum=0;
			for(int i=0;i<n;i++)
			{
				a[i]=in.nextInt();
				sum+=a[i];
			}
			for(int i=0;i<n-1;i++)
				b[i]=in.nextInt();
			Arrays.sort(b);
			for(int i=0;i<n-1;i++)//ジョイントを降順にソート
				j[i]=b[n-2-i];
			
			//給料=max(パイプの本数*パイプの長さの総和)
			 ans=n*sum;
			for(int i=0,k=n-1;k>=1;k--)//iジョイントインデックス kはパイプ数
			{
				sum+=j[i];
				i++;
				ans=Math.max(ans,k*sum);
			}
			System.out.println(ans);
		}
	}
	public static void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}