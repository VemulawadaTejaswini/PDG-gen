import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		try(Scanner sc = new Scanner(System.in))
		{
			int N = sc.nextInt();
			int cnt = 0;
			boolean[] t = new boolean[1000000001] ;
			int max = 0;

			for(int i = 0; i < N; i++)
			{
				int a = sc.nextInt();
				if(t[a] == true) t[a] = false;
				else t[a] = true;
				if(max < a) max = a;
			}

			for(int i = 0; i < max; i++)
			{
				if(t[i]) cnt++;
			}

			System.out.println(cnt);

		}


	}


}
