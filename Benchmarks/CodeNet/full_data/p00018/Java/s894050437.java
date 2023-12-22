import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		int[] arr=new int[6];
		Scanner inp=new Scanner(System.in);
		int n=5;
		int i;
		for(i=0; i<n; i++)
		{
			arr[i]=inp.nextInt();
		}
		Sortthis sorted=new Sortthis();
		sorted.sorting(arr, n);
		for(i=0; i<n-1; i++)
			System.out.print(arr[i]+" ");
		System.out.print(arr[i]);
	}
}

class Sortthis
{
	public void sorting(int[] arr, int n)
	{
		int i, j;
		for(i=1; i<n; i++)
		{
			j=i;
			while(j>0 && (arr[j]>arr[j-1]))
			{
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j=j-1;
			}
		}
	}
}