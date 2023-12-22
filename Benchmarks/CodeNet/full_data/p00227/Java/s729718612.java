import java.util.ArrayList;
import java.util.Arrays;
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
			ArrayList<Integer> L=new ArrayList<Integer>();
			int sum=0;
			int item=1;
			for(int i=0;i<n;i++)
				L.add(in.nextInt());
			Collections.sort(L);
			Collections.reverse(L);
			for(int i=0;i<n;i++)
			{
				sum+=L.get(i);
				if(item%m==0)
					sum-=L.get(i);
				item++;
			}
			System.out.println(sum);
		}
	}
}