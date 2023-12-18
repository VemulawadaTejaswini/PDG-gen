import java.util.*;

class Main 
{
	static boolean odd[] = new boolean[100001];

	static void countOdd()
	{
		for(int i = 2; i < 100001; i++)
			odd[i] = false;

		for(int i = 2; i < 100001; i++)
		{
			boolean flag = true;
			for(int j = 2; j < i; j++)
				if(i % j == 0)
				{
					flag = false;
					break;
				}
			
			if(flag)
				odd[i] = true;
		}
	}

  	public static void main(String[] args) 
	{
		countOdd();
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i  = 0; i < n; i++)
		{
			int x = sc.nextInt(),
				y = sc.nextInt(),
				count = 0;

			for(int j = x; j <= y; j++)
				if(odd[j] && odd[(j + 1) / 2])
					count++;

			System.out.println(count);
		}	
  	}
}