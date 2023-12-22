import java.util.Scanner;

public class Main
{
	public static void main(String... args)
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		for(int i = 0; i < num; i++)
		{
			arr[i] = s.nextInt();
		}
		bubbleSort(arr);
		for(int i = 0; i < num; i++)
		{
			System.out.print(arr[i] + (i < num-1 ? " " : ""));
		}
	}
	
	static void bubbleSort(int[] arr)
	{
		for(int i = arr.length - 1; i > 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				if(arr[j] < arr[j+1])
				{
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}