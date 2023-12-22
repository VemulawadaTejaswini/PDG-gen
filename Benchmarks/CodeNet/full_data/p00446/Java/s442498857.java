import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int ta[]=new int[(2*n)+1];
			int ha[]=new int[(2*n)+1];
			for(int i=0;i<n;i++)
				ta[in.nextInt()]++;
			for(int i=1;i<=2*n;i++)
				if(ta[i]==0)
					ha[i]++;
			int max=-1;
			for(int i=1;i<=2*n;i++)
			{
				if(ta[i]==1){
					ta[i]=0;
					max=i;
					break;}
			}
			int turn=1;
			int t=n-1;
			int h=n;
			int reset=0;
			for(;;)
			{
				if(turn==1)
				{
					for(int i=1;i<=2*n;i++)
					{
						if(i>max&&ha[i]==1)
						{
							h--;
							max=i;
							ha[i]=0;
							reset=1;
							break;
						}
					}
					turn=0;
					if(reset==0)
						max=0;
				}
				else if(turn==0)
				{
					for(int i=1;i<=2*n;i++)
						if(i>max&&ta[i]==1)
						{
							t--;
							max=i;
							ta[i]=0;
							reset=0;
							break;
						}
					turn=1;
					if(reset==1)
						max=0;
				}
				if(h==0||t==0)
					break;
			}
			System.out.println(h);
			System.out.println(t);
		}
	}
}