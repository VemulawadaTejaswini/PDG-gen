import java.lang.*;
import java.util.*;
public class Main{
public static void main(String[] args) 
{
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int[] x=new int[n];
	int[] f=new int[n+1];
	long ans=1;
	long m=(int)Math.pow(10,9)+7;
	for(int i=0;i<n;i++)
	{
		x[i]=scanner.nextInt();
		f[x[i]]++;
	}
	int a;
	if(n%2==0)a=1;
	else a=2;
	for(int i=a;i<n+1;i=i+2)
	{
		if(f[i]!=2){ans=0;break;}
	}
	if(ans==0)System.out.print(0);
	else {
		for(int i=0;i<(n/2);i++)
		{
			ans*=2;
			ans%=m;
		}
		System.out.print(ans);
	}
}	
}