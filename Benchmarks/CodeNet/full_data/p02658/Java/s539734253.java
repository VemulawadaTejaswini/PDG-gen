import java.io.*;
import java.util.*;
import java.math.*;
class B169
{
	static Scanner sc=new Scanner(System.in);
	static void solve()
	{
		int n,j,k,l,m;
		n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
		BigInteger ans=new BigInteger("1");
		for(int i=0;i<n;i++){
			String s=Long.toString(a[i]);
			BigInteger a1=new BigInteger(s);
			ans=ans.multiply(a1);
		}
		String s=ans.toString();
		if(s.compareTo("1000000000000000000")>0)
			System.out.println("-1");
		else
			System.out.println(s);
	}
	public static void main(String[] args) {
		int t=1;//sc.nextInt();
		while(t-->0)
			solve();
	}
} 