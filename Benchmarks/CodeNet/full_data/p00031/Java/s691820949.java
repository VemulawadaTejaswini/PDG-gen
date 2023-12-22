import java.util.*;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int w=in.nextInt();
			int a[]={1,2,4,8,16,32,64,128,256,512};
			boolean b[]=new boolean[10];
			Arrays.fill(b, false);
			for(int i=9;i>=0;i--)
			{
				if(w>=a[i])
				{
					w-=a[i];
					b[i]=true;
				}
			}
			boolean f=false;
			for(int i=0;i<10;i++)
			{
				if(b[i])
				{
					if(f)
						System.out.print(" ");
					System.out.print(a[i]);
					f=true;
				}
			}
			System.out.println();
		}
	}
}