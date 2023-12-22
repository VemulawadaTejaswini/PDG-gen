import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt(); //n<=20
			if(n==0)
				return;
			int a[]=new int[n];
			int A=0;
			int B=0;
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			Arrays.sort(a);
			for(int i=a.length-1;i>=0;i--)
			{
				if(A<B)
					A+=a[i];
				else
					B+=a[i];
			}
			int dif=Math.abs(A-B);
			System.out.println(dif);
		}
	}
	
	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
	}
}