import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k=s.nextInt();
		int n=s.nextInt();
		int d=0;
		int[] a= new int[n];
		for (int i=0; i<n; i++)
		{
		    a[i]=s.nextInt();
		}
		for(int i=0; i<(n-1); i++)
		{
		    if((a[i+1]-a[i])>d)
		    {d=a[i+1]-a[i];}
		    
		}
		d=k-d;
		System.out.println(""+d);
	}
}
