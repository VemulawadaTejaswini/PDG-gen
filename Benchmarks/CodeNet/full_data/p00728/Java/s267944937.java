import java.util.Scanner;
import java.io.IOException;

class Main 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int N;
		int[] data;

		while(true)
		{
			N = sc.nextInt();

			if(N == 0)
			{
				break;
			}

			data = new int[N];

			for(int i = 0; i < N; i++)
			{
				data[i] = sc.nextInt();
			}

			sort(data);

			System.out.println(myMean(data));
		}
	}

	private static void sort(int[] data)
	{
		int min, tmp;

		for(int i = 0; i < data.length; i++)
		{
			min = i;
			for(int j = i + 1; j < data.length; j++)
			{
				if(data[j] < data[min])
				{
					min = j;
				}
			}
			tmp = data[i];
			data[i] = data[min];
			data[min] = tmp;
		}
	}

	public static int myMean(int[] data)
	{
		int s = 0;
		
		for(int i = 1; i < data.length - 1; i++)
		{
			s += data[i];
		}

		return s / (data.length - 2);
	}
}