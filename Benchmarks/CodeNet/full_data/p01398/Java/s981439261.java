import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int N=in.nextInt();
			if(N==0)
				return;
			char c[]=in.next().toCharArray();
			int a[]=new int[N];
			int b[]=new int[N];
			for(int i=0;i<N;i++)
			{
				a[i]=in.nextInt();
				b[i]=in.nextInt();
			}
			for(int i=N-1;i>=0;i--)
				swap_cipher(a[i],b[i],c);

			for(int i=0;i<c.length-1;i++)
				System.out.print(c[i]);
			System.out.println(c[c.length-1]);
		}
	}

	static void swap_cipher(int a,int b,char c[])
	{
		int key=b-a;
		int A=(int)c[a-1];
		int B=(int)c[b-1];
		while(key-->0)
		{
			++A;
			++B;
			if(A==123)
				A=97;
			if(B==123)
				B=97;
		}
		c[a-1]=(char)B;
		c[b-1]=(char)A;
	}
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}