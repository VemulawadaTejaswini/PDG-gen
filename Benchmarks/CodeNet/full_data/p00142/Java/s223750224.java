import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			TreeSet<Integer>TS=new TreeSet<Integer>(); 
			ArrayList<Integer>AL=new ArrayList<Integer>();
			for(int i=1;i<n;i++)
				TS.add((i*i)%n);
			int a[]=new int[TS.size()];
			int k=0;
			for(int p:TS)
				a[k++]=p;
			for(int i=0;i<k;i++)
				for(int j=0;j<k;j++)
				{
					if(i==j)
						continue;
					int rem=a[i]-a[j];
					if(rem<0)
						rem+=n;
					if(rem>(n-1)/2)
						rem=n-rem;
					AL.add(rem);
				}
			int b[]=new int[(n-1)/2+1];
			for(int i=0;i<AL.size();i++)
				b[AL.get(i)]++;
			for(int i=1;i<=(n-1)/2;i++)
				System.out.println(b[i]);
		}
	}

	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
	}
}