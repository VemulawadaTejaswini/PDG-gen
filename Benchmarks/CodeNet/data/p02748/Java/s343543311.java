import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);	
	int n=s.nextInt();
	int m=s.nextInt();
	int k=s.nextInt();
	int a[]=new int[n];
	int c[]=new int[n];
	int d[]=new int[m];
	for(int i=0;i<n;i++)
	{a[i]=s.nextInt();
	c[i]=a[i];}
	Arrays.sort(c);
	int b[]=new int[n];
	for(int i=0;i<m;i++)
	{b[i]=s.nextInt();
	d[i]=b[i];}
	Arrays.sort(d);
	int min=c[0]+d[0];
	for(int i=0;i<k;i++)
	{int p=s.nextInt();
	int q=s.nextInt();
	p--;
	q--;
	int r=s.nextInt();
	min=Math.min(min,a[p]+b[q]-r);
	}
	System.out.println(min);
	}
}