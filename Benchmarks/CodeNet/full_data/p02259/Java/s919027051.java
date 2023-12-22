

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int ans = bubbleSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(i==arr.length-1)
			{
				System.out.print(arr[i]);
			}
			else
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println(ans);
	}
	
	public static int bubbleSort(int[] arr)
	{
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				//每一轮放最大的到最后
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					count++;
				}
			}
		}
		
		return count;
	}
}

