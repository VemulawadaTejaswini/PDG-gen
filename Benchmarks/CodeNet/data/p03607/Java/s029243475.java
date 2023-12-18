import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		HashSet<Integer> paper = new HashSet<Integer>();
		
		int count = 0;
		
		for(int i = 0; i < n ; i++)
		{
			int a = scan.nextInt();
			
			if(!paper.contains(a))
			{
				paper.add(a);
				count++;
			}
			else
			{
				paper.remove(a);
				count--;
			}
		}

		System.out.println(count);
		scan.close();
	}
}
