import java.util.ArrayList;
import java.util.Scanner;


public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<Integer> A = new ArrayList<Integer>(4000000);
		
		for(int i=0;i<N;i++)
		{
			int a_i=sc.nextInt();
			boolean find = false;
			for(int j=0;j<A.size();j++)
			{
				if(a_i==A.get(j))
				{
					find=true;
					A.remove(j);
					break;
				}
			}
			
			if(!find)
			{
				A.add(a_i);
			}
		}
		sc.close();
		
		System.out.println(A.size());
	}

}
