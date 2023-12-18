import java.lang.*;
import java.util.*;
public class Main{
public static void main(String[] args) 
{
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int x=scanner.nextInt();
	long[] a=new long[n];
	for(int i=0;i<n;i++)a[i]=scanner.nextInt();
	long cnt=0;
	long r,u;
	for(int i=0;i<n-1;i++)
	{	
		if((a[i+1]+a[i])>x){
			r=a[i+1]+a[i]-x;
			u=(int)Math.min(a[i+1],r);
			cnt+=u;
			a[i+1]-=u;
			if(a[i]>x)cnt+=a[i]-x;
		}
	}
	System.out.print(cnt);
}	
}
