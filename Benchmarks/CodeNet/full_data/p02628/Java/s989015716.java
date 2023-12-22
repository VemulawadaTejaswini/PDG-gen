import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int fruits[] = new int[n];
		for(int i=0;i<n;i++) fruits[i] = s.nextInt();
		solver(fruits,k);
	}
	private static void solver(int arr[],int k)
	{
		int min = 0;
		Arrays.sort(arr);
		for(int i=0;i<k;i++) min = min+arr[i];
		System.out.println(min); 
	}
}