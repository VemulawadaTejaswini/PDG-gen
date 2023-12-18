import java.util.ArrayList;
import java.util.*;
  public class Main
{
	public static void main (String[] args)
	 {
		Scanner sc=new Scanner(System.in); 
		long n=sc.nextLong();
		long k=sc.nextLong();
		int a[]=new int[(int)n+1];
		int c[]=new int[(int)n+1];
		for(int i=1;i<=n;i++)
			a[i]=sc.nextInt();
		int i=1;
		int h=0;
		while(true)
		{
			
			if(c[i]==1)
				break;
			c[a[i]]=1;
			i=a[i];
			
			
			k--;
			h++;
		}
		k%=h;
		while(k>=0)
		{
			i=a[i];
			k--;
		}
		System.out.println(i);
	}
}