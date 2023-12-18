import java.util.*;

class Main 
{
  	public static void main(String[] args) 
  	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		boolean ok;
		LinkedList<String> solve = new LinkedList<String>();
		
		do
		{
			ok = true;

			for(int i = 0; i < n - 1; i++)
			{
				if(arr[i] > arr[i + 1])
				{
					ok = false;

					if(arr[i] < 0 && arr[i + 1] < 0)
					{
						arr[i] += arr[i + 1];
						solve.add((i + 2) + " " + (i + 1));
					}
					else
					{
						arr[i + 1] += arr[i];
						solve.add((i + 1) + " " + (i + 2));
					}
				}
			}
		}while(!ok);

		System.out.println(solve.size());
		if(solve.size() != 0)
			for(String s : solve)
				System.out.println(s);
  	}
}