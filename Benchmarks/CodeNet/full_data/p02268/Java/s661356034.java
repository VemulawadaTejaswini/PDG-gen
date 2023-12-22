import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int[] string = new int[length];
		for(int i = 0; i < length; i++)
		{
			string[i] = in.nextInt();
		}
		
		length = in.nextInt();
		int[] search = new int[length];
		for(int i = 0; i < length; i++)
		{
			search[i] = in.nextInt();
		}
		
		int count = 0;
		for(int i = 0; i < length; i++)
		{
			if(Search(string, search[i]))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean Search(int[] list, int n)
	{
		int start = 0;
		int end = list.length - 1;
		while(start <= end)
		{
			int mid = ((start + end) / 2);
		
			if(list[mid] == n)
			{
				return true;
			} else if (list[mid] > n) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		
		return false;
	}
}


