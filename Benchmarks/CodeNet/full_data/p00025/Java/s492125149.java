import java.util.*;

class Main
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[]args)
	{
		while(in.hasNext())
		{
			String[] A = in.nextLine().split(" ");
			String[] B = in.nextLine().split(" ");
			int hit = 0, blow = 0;
			for(int i = 0; i < A.length;i++)
			{
				for(int j = 0; j < B.length;j++)
				{
					if(A[i].equals(B[j]))
					{
						if(i==j) hit++;
						else blow++;
					}
				}
			
			}
		System.out.printf("%d %d\n",hit,blow);
		}
	
	}
}