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
		
		int counter = 0;
		for(int i = 0; i < length; i++)
		{
			if(Search(string, search[i]))
			{
				counter++;
			}
		}
		System.out.println(counter);
	}
	
	public static boolean Search(int[] list, int n)
	{
		for(int i = 0; i < list.length; i++)
		{
			if(list[i] == n)
			{
				return true;
			}
		}
		return false;
	}
}

