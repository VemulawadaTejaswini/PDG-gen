import java.util.ArrayList;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> Cases = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		while(true) 
		{
			int x = scan.nextInt();
			if(x==0)
			{
				break;
			}
			Cases.add(x);
		}
		for(int i=0;i<Cases.size();i++)
		{
			System.out.println(String.format("Case %s: %s",i+1,Cases.get(i)));
		}
	}
}

