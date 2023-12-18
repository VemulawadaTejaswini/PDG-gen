import java.util.*;
 import java.math.BigInteger;
public class Main
{
	public static  void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		// String h[]=sc.nextLine().split(" ");
		// long n=Long.parseLong(sc.nextLine());
		String s[]=sc.nextLine().split(" ");
		long a=Long.parseLong(s[0]);
		long b=Long.parseLong(s[1]);
		long n=Long.parseLong(s[2]);
		long x=0;
		if(b>n){
		x=n;}
		else{x=b-1;}
		System.out.println((long)(a*x)/(long)b);
	}
	static int get(int [] arr, int k, int i, ArrayList<Pair>ch, int m)
	{
		if(i==arr.length)
		{
			int sum=0;
			for(int u=0;u<ch.size();u++)
			{
				if(arr[ch.get(u).b-1]-arr[ch.get(u).a-1]==ch.get(u).c){sum+=ch.get(u).d;}
			}
			return sum;
		}
		int max=0;
		for(int u=k;u<=m;u++)
		{
			arr[i]=u;
			max=Math.max(max,get(arr,u,i+1,ch,m));
			
		}
		return max;
	}

}
class Pair
{
	int a;
	int b;
	int c;
	int d;
	Pair(int e,int f, int g,int h){
		a=e;
		b=f;
		c=g;
		d=h;
	}
}



	
