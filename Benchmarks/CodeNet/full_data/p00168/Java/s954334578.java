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
			int a[]=new int[31];
			a[0]=0;
			a[1]=1;
			a[2]=2;
			a[3]=4;
			for(int i=4;i<=n;i++)
				a[i]=a[i-1]+a[i-2]+a[i-3];
			System.out.println((a[n]/365/10)+1);
		}
	}
}