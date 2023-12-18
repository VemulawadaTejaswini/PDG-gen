import java.util.*;
import java.lang.Math;


public class Main
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,k=0,flag=0,v,w=0,p=0,r=0;
		int n;
		double m,q;
		n=sc.nextInt();
		int[] x=new int[n];
		for(i=0;i<n;i++)
			x[i]=sc.nextInt();
		for(i=0;i<n;i++)
			k=k+x[i];
		j=k/n;
		w=k/n+1;

		v=0;
		q=0;
		for(i=0;i<n;i++)
		{
			m=(double)(j-x[i]);
			flag=(int)(Math.pow(m,2.0));
			v=v+flag;
			q=(double)(w-x[i]);
			r=(int)(Math.pow(q,2.0));
			p=p+r;

		}
		if(v<p)
			System.out.println(v);
		else
			System.out.println(p);

		
		
		
	}
}