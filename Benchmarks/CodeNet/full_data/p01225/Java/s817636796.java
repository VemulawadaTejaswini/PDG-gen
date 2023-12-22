import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num[] = new int[9];
		int color[] = new int[9];
		int red_num = 0;
		int green_num = 0;
		int blue_num = 0;
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				num[j] = sc.nextInt();
			}
			for(int j = 0; j < 9; j++)
			{
				String a = sc.next();
				if(a.compareTo("R") == 0)
				{
					color[j] = 1;
					red_num += 1;
				}
				if(a.compareTo("G") == 0)
				{
					color[j] = 2;
					green_num += 1;
				}
				if(a.compareTo("B") == 0)
				{
					color[j] = 3;
					blue_num += 1;
				}
			}
			int red[] = new int[red_num];
			int green[] = new int[green_num];
			int blue[] = new int[blue_num];
			red_num = 0;
			green_num = 0;
			blue_num = 0;
			for(int j = 0; j < 9; j++)
			{
				switch(color[j])
				{
				case 1:
					red[red_num] = num[j];
					red_num += 1;
					break;
				case 2:
					green[green_num] = num[j];
					green_num += 1;
					break;
				case 3:
					blue[blue_num] = num[j];
					blue_num += 1;
					break;
				}
			}
			Arrays.sort(red);
			Arrays.sort(blue);
			Arrays.sort(green);
			int count = 0;
			for(int j = 1; j <= 9; j++)
			{
				if(array_count(red,j) == true) count+= 1;
				if(array_count(green,j) == true) count+= 1;
				if(array_count(blue,j) == true) count+= 1;
			}
			count = count +array_search(red) + array_search(blue) + array_search(green);
			if(count == 3)System.out.println(1);
			else System.out.println(0);
		}
	}
	
	static boolean array_count(int[] a,int num)
	{
		int count = 0;
		for(int i = 0; i < a.length;i++)
		{
			if(a[i] == num) count += 1;
		}
		return (count == 3);		
	}
	static boolean search_num(int[] a,int num)
	{
		for(int i = 0;i < a.length; i++)
		{
			if(a[i] == num) return true;
		}
		return false;
	}
	
	static int array_search(int[] a)
	{
		if(a.length != 0) 
		{
			int count = 0;
			int number[] = new int[9];
			for(int i = 0;i < 9; i++)
			{
				number[i] = 0;
			}
			for(int i = 0; i < a.length; i++)
			{
				if(a[i] != 0)number[(a[i] - 1)] += 1;
			}
		for(int i = 0; i <= 6;i++)
		{
			if(number[i] > 0 && number[i+1] > 0 && number[i+2] > 0)
			{
				count += 1;
				number[i] -=1;
				number[i+1] -=1;
				number[i+2] -=1;
			}
		}
		return count;
		}
		else return 0;
		
	}
	
	
}