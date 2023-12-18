import java.util.LinkedList;
import java.util.Scanner;
 
 
public class Main 
{
 
	public static void main(String[] args) 
	{
//		long start = System.nanoTime();
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
 
		final LinkedList<Integer> A = new LinkedList<Integer>();
		int a_i=0;
		boolean find =false;
		int i=0;
		int c=0;
		
		for(i=0;i<N;i++)
		{
			a_i=Integer.parseInt(sc.next());
			find = false;
			c=0;
			for (int j : A) 
			{
				if(a_i == j)
				{
					find=true;
					A.remove(c);
					break;
				}
				c++;
			}
			
			if(!find)
			{
				A.add(a_i);
			}
		}
		sc.close();
		
		System.out.println(A.size());
		
//		long end = System.nanoTime();
//		System.out.println("Time:" + (end - start) / 1000000f + "ms");
	}
 
}

