import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] item = new String[n];
		
		boolean A = true;
		int m = 0;
		
		for(int i = 0; i < n; i++)
		{
			item[i] = sc.next();
		}
		
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				if(item[i].equals(item[j]))
				{
					A = false;
					break;
				}
			}
			
			if(A == true)
			{
				m++;
			}
			A = true;
		}
		
		System.out.println(m);
	}
}