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
		int n=Integer.parseInt(s[0]);
		int m=Integer.parseInt(s[1]);
		int q=Integer.parseInt(s[2]);
		ArrayList<Pair>ch=new ArrayList<>();
		for(int i=0;i<q;i++)
		{
			String h[]=sc.nextLine().split(" ");
			ch.add(new Pair(Integer.parseInt(h[0]),Integer.parseInt(h[1]),Integer.parseInt(h[2]),Integer.parseInt(h[3])));
		}
		System.out.println(get(new int[n],1,0,ch,m));
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



	
