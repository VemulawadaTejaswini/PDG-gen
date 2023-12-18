
import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);	
	int n=s.nextInt();
	int m=s.nextInt();
	int k=s.nextInt();
	long a[]=new long[n];
	long c[]=new long[n];
	long d[]=new long[m];
	for(int i=0;i<n;i++)
	{a[i]=s.nextLong();
	c[i]=a[i];}
	Arrays.sort(c);
	long b[]=new long[n];
	for(int i=0;i<m;i++)
	{b[i]=s.nextLong();
	d[i]=b[i];}
	Arrays.sort(d);
	long min=c[0]+d[0];
	for(int i=0;i<k;i++)
	{int p=s.nextInt();
	int q=s.nextInt();
	p--;
	q--;
	long r=s.nextLong();
	min=Math.min(min,a[p]+b[q]-r);
	}
	System.out.println(min);
	}
}