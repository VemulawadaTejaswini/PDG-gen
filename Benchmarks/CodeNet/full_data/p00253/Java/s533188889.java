import java.util.ArrayList;
import java.util.Scanner;
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
			ArrayList<Integer> Al=new ArrayList<Integer>();
			int ans=0;
			for(int i=0;i<=n;i++)
				Al.add(in.nextInt());

			for(int i=0;i<=n;i++) //i番目の数字を抜いて考える
			{
				ArrayList Al2=new ArrayList(Al);
				Al2.remove(i);
				if(judge(Al2))
				{
					ans=i;
					break;
				}
			}
			System.out.println(Al.get(ans));
		}
	}
	static boolean judge(ArrayList<Integer> AL)
	{
		int diff=AL.get(1)-AL.get(0);
		for(int i=1;i<AL.size();i++)
		{
			if(AL.get(i)-AL.get(i-1)!=diff)
			return false;
		}
		return true;
	}
}