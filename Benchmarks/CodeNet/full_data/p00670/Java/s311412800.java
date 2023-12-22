import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			int S=in.nextInt();
			if((n|S)==0)
				return;
			int a[]=new int[n];
			int cnt=0;
			ArrayList<Integer>AL=new ArrayList<Integer>();
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			for(int i=0;i<n;i++)
				for(int j=i+1;j<n;j++)
				{
					if(i==j)
						continue;
					AL.add(a[i]+a[j]);
				}
			for(int p:AL)
				if(p>S)
					cnt++;
			System.out.println(cnt);
		}
	}
}