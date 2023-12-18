import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
 
 
public class Main 
{
 
	public static void main(String[] args)  throws Exception
	{
//		long start = System.nanoTime();
		final Scanner sc = new Scanner(System.in);
		final int N = Integer.parseInt(sc.next());
		sc.close();
 
		final ArrayList<Integer> A = new ArrayList<Integer>();
		int a_i=0;
		int i=0;
		int index=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(i=0;i<N;i++)
		{
			a_i=Integer.parseInt(br.readLine());
			index =A.indexOf(a_i);
			
			if(index!=-1)
			{
				A.remove(index);
			}
			else
			{
				A.add(a_i);
			}
		}

		
		System.out.println(A.size());
		
//		long end = System.nanoTime();
//		System.out.println("Time:" + (end - start) / 1000000f + "ms");
	}
 
}

