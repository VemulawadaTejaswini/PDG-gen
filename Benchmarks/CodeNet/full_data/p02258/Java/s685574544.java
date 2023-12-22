import java.util.Scanner;

public class Main{
	public static void  main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int buy,ben;
		ben = Integer.MIN_VALUE;
		
		int[] R  = new int[n];
		for(int i = 0 ; i < n ; i++ )
		{
			R[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n-1 ; i++ )
		{
			buy = R[i];
			for(int j = i+1 ; j < n ; j++ )
			{
				if( R[j] - R[i] > ben ) ben = R[j]-R[i] ; 
			}
		
		}
		System.out.println(ben);
		
	}
}