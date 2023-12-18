import java.util.*;
import java.lang.Math;
public class Main{
     public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int i,j,k=0;
		int n;
		double m,q;
		n=s1.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++){
			a[i]=s1.nextInt();
		
			k=k+a[i];
        }
		int o=k/n;
		int w=k/n+1;
 
		int v=0;
		int d=0;
		for(j=0;j<n;j++)
		{
			m=(double)(o-a[j]);
			int b=(int)(Math.pow(m,2.0));
			v=v+b;
			q=(double)(w-a[j]);
			int c=(int)(Math.pow(q,2.0));
			d=d+c;
 
		}
		if(v<d){
			System.out.println(v);
        }
		else{
			System.out.println(d);
        }
     }
}