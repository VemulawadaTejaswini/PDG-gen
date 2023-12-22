import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args)
	{
		// TODO 自動生成されたメソッド・スタブ
		try
		{
			String str1[] = input(1);
			String str2[] = input(Integer.parseInt(str1[0]));
			int[] a = new int[str2.length];
			for(int i = 0; i < str2.length; i++)
			{
				a[i] = Integer.parseInt(str2[i]);
			}
			int swa = SelectionSort(a);
			for(int i = 0; i < a.length; i++)
			{
				System.out.print(a[i]);
				if(i != a.length - 1) System.out.print(" ");
			}
			System.out.println("\n" + swa);
		}
		catch(IOException e)
		{
		}
	}

	public static int SelectionSort(int a[])
	{
		int Select = 0;
		for(int j = 0; j < a.length - 1; j++)
		{
			int[] min = {0, Integer.MAX_VALUE};
			for(int i = j; i < a.length; i++)
			{
				if(min[1] > a[i])
				{
					min[1] = a[i];
					min[0] = i;
				}
			}
			if(j != min[0])
			{
				Select++;
				swap(a, min[0], j);
			}
		}
		return Select;
	}

	public static int BubbleSort(int a[])
	{
		int swapp = 0;
		boolean flag = true;
		while(flag)
		{
			flag = false;
			for(int i = 0; i < a.length - 1; i++)
			{
				if(a[i] > a[i+1])
				{
					swapp++;
					swap(a, i, i+1);
					flag = true;
				}
			}
		}
		return swapp;
	}

	public static void swap(int a[], int x, int y)
	{
		a[x] = a[x] ^ a[y];
		a[y] = a[x] ^ a[y];
		a[x] = a[x] ^ a[y];
	}

	/*
	public static int Calc(int[] a, int f, int e)
	{
		ArrayList<Integer> list[] = new ArrayList[2];
		return e;
	}
	//*/

	public static String[] input(int Num) throws IOException
	{
		String str[] = new String[Num];
		String str2 = br.readLine();
		int j = 0;
		for(int i = 0; i < Num; i++)
		{
			if(i < Num - 1)
			{
				str[i] = str2.substring(j, str2.indexOf(" ", j));
				j = str2.indexOf(" ", j) + 1;
			}
			else
			{
				str[i] = str2.substring(j);
			}
		}
		return str;
	}

}

