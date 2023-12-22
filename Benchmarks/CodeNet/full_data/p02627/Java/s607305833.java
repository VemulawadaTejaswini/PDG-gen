import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<k;i++){
			sum += arr[i];
		}
		System.out.println(sum);
	}
}