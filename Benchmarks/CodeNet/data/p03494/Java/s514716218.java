import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int ans=Integer.numberOfTrailingZeros(sc.nextInt());
		for(int i=1;i<n;i++)
		{
			ans=Math.min(ans,Integer.numberOfTrailingZeros(sc.nextInt()));
		}
		System.out.println(ans);
	}
}