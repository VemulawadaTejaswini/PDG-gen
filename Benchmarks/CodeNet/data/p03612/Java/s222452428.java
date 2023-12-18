import java.util.*;

class Main 
{
  	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] =  new int[n];
		int flag[] = new int[n];

		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i] == (i + 1))
				flag[i] = 1;
		}
		
		int cnt = 0;
		for(int i = 0, j = 0; i < n; i++)
		{
			if(flag[i] == 1)
			{
				for(j = i + 1; j < n; j++)
					if(flag[j] == 1)
						break;
				
				if(j - i == 1)
					cnt++;
				else
					cnt += 2;
				i = j + 1;
			}
		}

		System.out.println(cnt);
  	}
}