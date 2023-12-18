import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] value = new int[9];
		boolean[] flags = new boolean[9];

		for(int i = 0; i < 9; i++)
		{
			value[i] = sc.nextInt();
		}

		int N = sc.nextInt();

		for(int i = 0; i < N; i++)
		{
			int num = sc.nextInt();
			for(int j = 0; j < 9; j++)
			{
				if(num == value[j])
				{
				   flags[j] = true;
				   break;
			    }
			}
		}

		if(flags[0] == flags[1] == flags[2] == true
			|| flags[3] == flags[4] == flags[5] == true
			|| flags[6] == flags[7] == flags[8] == true
			|| flags[0] == flags[3] == flags[6] == true
			|| flags[1] == flags[4] == flags[7] == true
			|| flags[2] == flags[5] == flags[8] == true
			|| flags[0] == flags[4] == flags[8] == true
			|| flags[3] == flags[4] == flags[6] == true)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
