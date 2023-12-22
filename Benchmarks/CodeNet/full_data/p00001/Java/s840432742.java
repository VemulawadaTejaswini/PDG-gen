import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] list = new int[10];
		for(int i = 0; i < 10; ++i)
			list[i] = Integer.parseInt(sc.nextLine());
		QuickSort(list, 0, 10);
		for(int i = 9; i > 6; --i)
			System.out.println(list[i]);
	}
	
	public static void QuickSort(int[] array, int first, int n)
	{
		if(n<=1)
			return;		
		int Pivot = array[first + n/2 - 1];
		int Left = first;
		int Right = first + n - 1;
		while(Left <= Right)
		{
			while(array[Left] < Pivot)
				Left++;
			
			while(array[Right] > Pivot)
				Right--;
			if(Left <= Right)
			{
				int tmp = array[Left];
				array[Left] = array[Right];
				array[Right] = tmp;
				Left++;
		    	Right--;
			}
		}
		QuickSort(array, first, Right - first + 1);
		QuickSort(array, Left, first +  n  - Left );
	}

} 