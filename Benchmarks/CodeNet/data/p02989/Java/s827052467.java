
import java.util.Scanner;

public class Main{

	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();//数字的个数
		int[] arr = new int[n];
		for(int a=0;a<arr.length;++a)
		{
			arr[a] = sc.nextInt();
		}
		
		int index=0;
		int min=0;
		int num=0;
		for(int a=0;a<arr.length-1;++a)
		{
			index = a;
			min = arr[a];
			for(int b = a+1;b<arr.length;++b)
			{
				if(arr[b]<min)
				{
					index =b;
					min = arr[b];
				}
			}
			num = arr[a];
			arr[a] = arr[index];
			arr[index] = num;
			
		}

		
		int m=n/2;
		int x=0;
		
		int max1=0,min1=0;
		int p=0;
		for(int y=arr[m-1];y<=arr[m];++y)
		{
			for(int a=0;a<arr.length;++a)
			{
			if(arr[a]>=y)
				++max1;
			if(arr[a]<y)
				++min1;
			}
			if(max1==min1)
				++p;
			max1=0;
			min1=0;
		}
		System.out.println(p);
	}

}
