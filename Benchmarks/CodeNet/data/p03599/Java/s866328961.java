
import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] A=new int[2];
		A[0]=sc.nextInt();A[1]=sc.nextInt();int C=sc.nextInt(),D=sc.nextInt(),E=sc.nextInt(),F=sc.nextInt();
		double max=0;
		int[] ans=new int[2];
		for(int i=0;i<2;i++)
		{
			int lim=A[i]*E;
			int clim=lim/C,dlim=lim/D;
			for(int j=0;j<=clim;j++)
			{
				for(int k=0;k<=dlim;k++)
				{
					int sugar=C*j+D*k;
					if(lim<sugar){break;}
					if(100*A[i]+sugar>F){break;}
					double buf=100.0*(double)sugar/((double)(100*A[i])+(double)sugar);
					if(buf>max){max=buf;ans[0]=100*A[i]+sugar;ans[1]=sugar;}
				}
			}
		}
		if(max==0){System.out.println(100*A[0]+" "+0);}
		else{System.out.println(ans[0]+" "+ans[1]);}


	}
}