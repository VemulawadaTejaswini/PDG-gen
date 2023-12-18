import java.util.*;
public class Main{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
      	int k=sc.nextInt();
		int h[]=new int[n];
		for(int i=0;i<n;i++)
		{
			h[i]=sc.nextInt();
		}
		int min[]=new int[n];
		min[0]=0;
		min[1]=(int)Math.abs(h[1]-h[0]);
		for(int i=2;i<n;i++)
		{
          int m=99999;
          for(int j=1;j<=k;j++)
          {
            if((i-k)>=0)
            {int h1=(int)Math.abs(h[i]-h[i-j])+min[i-j];
			m=h1<m?h1:m;}
          }
          min[i]=m;
		}
		System.out.println(min[n-1]);
	}

}
