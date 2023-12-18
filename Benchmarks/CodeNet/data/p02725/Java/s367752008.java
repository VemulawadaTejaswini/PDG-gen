import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args)
	{
			Scanner sc = new Scanner(System.in);
			int K = sc.nextInt();
			int N = sc.nextInt();
			int arr[] = new int[N];
			long halfperimeter = K/2;
			int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
			for(int i = 0; i < N ;i++)
			{
				arr[i] = sc.nextInt();							
			}
			int l1 = arr[N-1] -arr[0];
			int l2 =  (K-arr[N-1] )+ arr[N-2];
			System.out.println(Math.min(l1,l2));
	}
}
