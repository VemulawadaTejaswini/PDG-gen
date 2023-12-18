import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] a=new int[N+2];
		int buf=0;
		int cnt=0;
		int fl=-100;
		int j=0;
		int b=0;
		int c=0;
		a[0]=-100;a[N+1]=-100;
		for(int i=1;i<=N;i++)
		{
			a[i]=sc.nextInt();
			if(fl==i-1&&a[i]==i){buf=a[i];a[i]=a[i-1];a[i-1]=buf;cnt++;fl=-100;}
			else{fl=(a[i]==i)?i:-100;}
		}

		for(int i=1;i<N;i++)
		{
			if(a[i]==i&&((a[i-1]!=i&&a[i-1]!=-100)||(a[i+1]!=i)&&a[i+1]!=-100)){cnt++;}
			else if(a[i]==i)
			{
				j=i-1;
				while(a[j]==i)
				{
					b++;
					j--;
					if(a[j]==-100)
					{
						b=Integer.MAX_VALUE;
					}
				}
				j=i+1;
				while(a[j]==i)
				{
					c++;
					j++;
					if(a[j]==-100)
					{
						c=Integer.MAX_VALUE;
					}
				}
				b=(b<c)?b:c;
			}
		}
		
		System.out.println(cnt+b);
	}
}