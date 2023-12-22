import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			int m=in.nextInt();
			if((n|m)==0)
				return;
			int t=n+m;
			ArrayList<Integer> L=new ArrayList<Integer>();
			for(int i=0;i<t;i++)
				L.add(in.nextInt());
			Collections.sort(L);
			int max;
			if(t==1)
				max=L.get(0);
			else
				max=0;
			for(int i=0;i<t-1;i++)
			{
				int tmp=L.get(i+1)-L.get(i);
				if(max<tmp)
					max=tmp;
			}
			System.out.println(max);
		}
	}
}