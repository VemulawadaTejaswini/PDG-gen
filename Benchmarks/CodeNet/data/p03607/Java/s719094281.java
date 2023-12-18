import java.util.HashSet;
import java.util.Scanner;
 
 
public class Main 
{
 
	public static void main(String[] args) 
	{
		long start = System.nanoTime();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		HashSet<Integer> A = new HashSet<Integer>();
 
		for(int i=0;i<N;i++)
		{
			int a_i=sc.nextInt();					
			if(!A.contains(a_i))
			{
				A.add(a_i);
			}
			else
			{
				A.remove(a_i);
			}
		}
		sc.close();
		
		System.out.println(A.size());
		long end = System.nanoTime();
		System.out.println("Time:" + (end - start) / 1000000f + "ms");
	}
}