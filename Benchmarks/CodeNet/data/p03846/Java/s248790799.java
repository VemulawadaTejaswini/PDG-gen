import java.lang.*;
import java.util.*;
public class Main{
public static void main(String[] args) 
{
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int[] a=new int[n];
	int[] f=new int[n+1];
	long ans=1;
	long m=(int)Math.pow(10,9)+7;
	for(int i=0;i<n;i++)
	{
		a[i]=scanner.nextInt();
		f[a[i]]++;
	}
	for(int i=0;i<n+1;i++)
	{
		if(f[i]>0)ans*=f[i];
		ans=ans%m;
	}
	if(f[0]>1)ans=0;
	System.out.print(ans);
}	
}
