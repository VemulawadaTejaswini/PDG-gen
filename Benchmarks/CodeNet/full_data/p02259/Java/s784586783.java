import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<N;i++)
		{
			list.add(sc.nextInt());
		}
		int ans=0;
		for(int i=0;i<N;i++)
		{
			for(int j=N-1;j>=i+1;j--)
			{
				if(list.get(j)<list.get(j-1))
				{
					int temp=list.get(j-1);
					list.set(j-1,list.get(j));
					list.set(j,temp);
					ans++;
				}
			}
		}
		for(int i=0;i<list.size();i++)
		{
			if(i==list.size()-1)
			{
				System.out.print(list.get(i));
			}
			else
			{
				System.out.print(list.get(i)+" ");
			}
		}
		System.out.println();
		System.out.println(ans);
	}
}

