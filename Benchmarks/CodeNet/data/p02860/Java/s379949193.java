import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Stack;

public class Main {
	static Scanner scn = new Scanner(System.in);
	static int count = 0, min = Integer.MAX_VALUE;

	public static void main(String[] args) 
	{
		int n =scn.nextInt();
		String str=scn.next();
		if(n==1)
		{
			System.out.println("No");
			return;
		}
		boolean bl=true;
		int j=n/2;
		for(int i=0;i<n&&j<n;i++)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				bl=false;
				break;
			}
			j++;
		}
		if(bl)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		
	}
	public  static void subset(int arr[], int k, int sum, String ans, int prev) {
		if (sum == k) {
			System.out.print(ans + " ");
			return;
		}
		if (sum > k)
			return;

		for (int i = prev; i < arr.length; i++) {
			subset(arr, k, sum + arr[i], ans + arr[i], i);
		}
	}

	public static int gcd(int a, int b) {
		if (a == 0)
			return b;
		int l = gcd(b % a, a);
		return l;
	}

	public static void grid(int arr[][], int h, int v, int sum, int n, int m) {
		if (h == n - 1 && v == m - 1) {
			sum = sum + arr[h][v];
			if (sum <= min)
				min = sum;
			return;
		}
		if (h >= n)
			return;
		if (v >= m)
			return;
		grid(arr, h + 1, v, sum + arr[h][v], n, m);
		grid(arr, h, v + 1, sum + arr[h][v], n, m);
		grid(arr, h + 1, v + 1, sum + arr[h][v], n, m);
	}

	public static int  last(int arr[],int m,int i)
	{	
		if(i==arr.length)
		{	
			return -1;	
		}
		int s=last(arr, m, i+1);
		if(arr[i]==m && s==-1)
		{	
			return i;
		}
		return s;
		
	}
}
